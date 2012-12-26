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
public class LoginController {

	@Autowired
	private BudgetService budgetService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("errormessage", "Invalid username and password.");
		return new ModelAndView("login", model);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView postLogin(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		Map<String, Object> model = new HashMap<String, Object>();
		try {
			User user = budgetService.checkLogin(
					request.getParameter("userName"),
					request.getParameter("password"));
			model.put("user", user);
			if (user == null) {
				model.put("errormessage", "Invalid username and password.");
				return new ModelAndView("login", model);
			} else {
				session.setAttribute("user", user);
				return new ModelAndView("redirect:homePage");
			}
		}

		catch (java.lang.IndexOutOfBoundsException e) {
			model.put("errormessage", "Invalid username and password.");
			return new ModelAndView("login", model);
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate();
		return new ModelAndView("redirect:login");
	}
}
