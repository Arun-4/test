package net.viralpatel.contact.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.viralpatel.contact.model.User;
import net.viralpatel.contact.model.RegisterForm;
import net.viralpatel.contact.service.BudgetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	@Autowired
	private BudgetService budgetService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("register", model);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView saveRegister(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("registerForm") RegisterForm registerForm) {
		Map<String, Object> model = new HashMap<String, Object>();
		User register = new User();
		register.setFamilyName(registerForm.getFamilyName());
		register.setUserName(registerForm.getUserName());
		register.setPassword(registerForm.getPassword());
		register.setName(registerForm.getName());
		register.setDob(registerForm.getDob());
		register.setMobNo(registerForm.getMobNo());
		register.setEmail(registerForm.getEmail());
		register.setLocation(registerForm.getEmail());
		register.setStreet(null);
		register.setState(null);
		register.setCity(registerForm.getCity());
		register.setCountry(registerForm.getCountry());
		register.setRole("admin");
		budgetService.saveRegister(register);
		model.put("success", "success");
		return new ModelAndView("register", model);
	}
}
