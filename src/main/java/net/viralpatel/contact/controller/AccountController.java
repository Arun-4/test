package net.viralpatel.contact.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.viralpatel.contact.model.BankAccount;
import net.viralpatel.contact.model.BankAccountForm;
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
public class AccountController {

	@Autowired
	private BudgetService budgetService;

	@Autowired
	private Manager manager;

	@RequestMapping(value = "account", method = RequestMethod.GET)
	public ModelAndView account(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		if (!session.isNew()) {
			Map<String, Object> model = new HashMap<String, Object>();
			return new ModelAndView("bankAccount", model);
		} else {
			return new ModelAndView("redirect:login");
		}

	}

	@RequestMapping(value = "accountList", method = RequestMethod.GET)
	public ModelAndView accounList(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		if (!session.isNew()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("bankAccounts", budgetService.getAccounts());
			return new ModelAndView("accountList", model);
		} else {
			return new ModelAndView("redirect:login");
		}

	}

	@RequestMapping(value = "deleteAccount", method = RequestMethod.GET)
	public  @ResponseBody Object deleteAccount(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		if (!session.isNew()) {
			Map<String, Object> model = new HashMap<String, Object>();
			try{
				Integer id = Integer.parseInt(request.getParameter("id"));
				manager.removeObject(BankAccount.class, id);
				model.put("success", true);
				model.put("deletedid", id);
				return model;
			}
			catch (Exception e) {
				model.put("success", false);
				return model;
			}
		} else {
			return new ModelAndView("redirect:login");
		}

	}

	@RequestMapping(value = "account", method = RequestMethod.POST)
	public @ResponseBody
	Object postAccount(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("bankAccountForm") BankAccountForm bankAccountForm,
			HttpSession session) {
		Map<String, Object> model = new HashMap<String, Object>();
		if (!session.isNew()) {
			User user = (User) session.getAttribute("user");
			BankAccount bankAccount = new BankAccount();
			bankAccount.setUser(user);
			bankAccount.setBankName(bankAccountForm.getBankName());
			bankAccount.setAccountNo(bankAccountForm.getAccountNo());
			bankAccount.setBranchName(bankAccountForm.getBranchName());
			bankAccount.setBankLocation(bankAccountForm.getBankLocation());
			bankAccount.setAccountType(bankAccountForm.getAccountType());
			bankAccount.setModifiedDate(new Date());
			budgetService.saveAccount(bankAccount);
			model.put("success", true);
			return model;
		} else {
			return new ModelAndView("redirect:login");
		}

	}

}
