package net.viralpatel.contact.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.viralpatel.contact.model.BankAccount;
import net.viralpatel.contact.model.Expense;
import net.viralpatel.contact.model.ExpenseForm;
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
public class ExpenseController {

	@Autowired
	private BudgetService budgetService;

	@Autowired
	private Manager manager;

	@RequestMapping(value = "expense", method = RequestMethod.GET)
	public ModelAndView expense(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		if (!session.isNew()) {
			Map<String, Object> model = new HashMap<String, Object>();
			return new ModelAndView("expense", model);
		} else {
			return new ModelAndView("redirect:login");
		}
	}

	@RequestMapping(value = "expenseList", method = RequestMethod.GET)
	public ModelAndView expenseList(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		if (!session.isNew()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("expenses", budgetService.getExpenses());
			return new ModelAndView("expenseList", model);
		} else {
			return new ModelAndView("redirect:login");
		}
	}

	@RequestMapping(value = "deleteExpense", method = RequestMethod.GET)
	public @ResponseBody
	Object deleteAccount(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		Map<String, Object> model = new HashMap<String, Object>();
		if (!session.isNew()) {
			Integer id = Integer.parseInt(request.getParameter("id"));
			manager.removeObject(Expense.class, id);
			model.put("success", true);
			model.put("deletedid", id);
			return model;
		} else {
			model.put("sucess", false);
			return model;
		}

	}

	@RequestMapping(value = "expense", method = RequestMethod.POST)
	public @ResponseBody
	Object saveExpense(HttpServletRequest request,
			HttpServletResponse response, HttpSession session,
			@ModelAttribute("expenseForm") ExpenseForm expenseForm) {
		Map<String, Object> model = new HashMap<String, Object>();
		if (!session.isNew()) {
			Expense expense = new Expense();
			User user = (User) session.getAttribute("user");
			expense.setUser(user);
			expense.setExpenseDate(expenseForm.getExpenseDate());
			expense.setExpDesc(expenseForm.getExpDesc());
			expense.setExpTitle(expenseForm.getExpTitle());
			expense.setAmount(expenseForm.getAmount());
			budgetService.saveExpense(expense);
			model.put("success", true);
			return model;
		} else {
			model.put("success", false);
			return model;
		}
	}
}
