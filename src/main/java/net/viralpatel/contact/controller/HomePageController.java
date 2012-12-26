package net.viralpatel.contact.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.viralpatel.contact.model.User;
import net.viralpatel.contact.service.BudgetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

	@Autowired
	private BudgetService budgetService;
	
	@RequestMapping(value = "homePage", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		Map<String, Object> model = new HashMap<String, Object>();
		if (!session.isNew()) {
			model.put("user", (User) session.getAttribute("user"));
			model.put("bankAccounts", budgetService.getAccounts());
			model.put("transitions",budgetService.getTransitionList());
			model.put("expenseAmount", budgetService.getTotalExpense());
			return new ModelAndView("homePage", model);
		} else {
			return new ModelAndView("redirect:login", model);
		}
	}

}
