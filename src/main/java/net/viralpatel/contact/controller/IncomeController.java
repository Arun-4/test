package net.viralpatel.contact.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.viralpatel.contact.model.BankAccount;
import net.viralpatel.contact.model.Expense;
import net.viralpatel.contact.model.Transition;
import net.viralpatel.contact.model.TransitionForm;
import net.viralpatel.contact.model.User;
import net.viralpatel.contact.service.BudgetService;
import net.viralpatel.contact.service.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IncomeController {

	@Autowired
	private BudgetService budgetService;

	@Autowired
	private Manager manager;

	@RequestMapping(value = "income", method = RequestMethod.GET)
	public ModelAndView income(HttpServletRequest request,
			HttpServletResponse response, HttpSession httpSession) {
		if (!httpSession.isNew()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("bankAccounts", budgetService.getAccounts());
			return new ModelAndView("income", model);
		} else {
			return new ModelAndView("redirect:login");
		}
	}

	@RequestMapping(value = "getIncome", method = RequestMethod.GET)
	public @ResponseBody
	User getincome(HttpServletRequest request, HttpServletResponse response,
			HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("user");
		return user;

	}

	@RequestMapping(value = "incomeList", method = RequestMethod.GET)
	public ModelAndView incomeList(HttpServletRequest request,
			HttpServletResponse response, HttpSession httpSession) {
		if (!httpSession.isNew()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("transactions", budgetService.getTransactions());
			return new ModelAndView("incomeList", model);
		} else {
			return new ModelAndView("redirect:login");
		}
	}

	@RequestMapping(value = "deleteTransaction", method = RequestMethod.GET)
	public @ResponseBody
	Object deleteAccount(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		Map<String, Object> model = new HashMap<String, Object>();
		if (!session.isNew()) {
			Integer id = Integer.parseInt(request.getParameter("id"));
			manager.removeObject(Transition.class, id);
			model.put("success", true);
			model.put("deletedid", id);
			return model;
		} else {
			model.put("success", false);
			return model;
		}

	}

	@RequestMapping(value = "income", method = RequestMethod.POST)
	public @ResponseBody
	Object saveIncome(HttpServletRequest request, HttpServletResponse response,
			HttpSession httpSession,
			@ModelAttribute("transitionForm") TransitionForm transitionForm) {
		Map<String, Object> model = new HashMap<String, Object>();
		if (!httpSession.isNew()) {
			Transition transition = new Transition();
			User user = (User) httpSession.getAttribute("user");
			BankAccount bankAccount = budgetService.getAccount(transitionForm
					.getBankName());
			transition.setUser(user);
			transition.setBankId(bankAccount);
			transition.setCode(transitionForm.getCode());
			if (transition.getCode().equals("credit")) {
				transition.setDebit(0);
				transition.setCredit(transitionForm.getAmount());
			} else {
				transition.setDebit(transitionForm.getAmount());
				transition.setCredit(0);
			}
			transition.setTransitionDate(transitionForm.getTransitionDate());
			budgetService.saveTransition(transition);
			model.put("success", true);
			return model;
		} else {
			model.put("success", false);
			return model;
		}
	}
}
