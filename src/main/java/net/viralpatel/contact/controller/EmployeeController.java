package net.viralpatel.contact.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.viralpatel.contact.model.AddEmployeeForm;
import net.viralpatel.contact.model.Employee;
import net.viralpatel.contact.service.BudgetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private BudgetService budgetService;

	@RequestMapping(value = "employeeList", method = RequestMethod.GET)
	public ModelAndView employeeList(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees", budgetService.getEmployees());
		return new ModelAndView("employeeList", model);
	}

	@RequestMapping(value = "addEmployee", method = RequestMethod.GET)
	public ModelAndView addEmployee(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("addEmployee", model);
	}

	@RequestMapping(value = "addEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("addEmployeeForm") AddEmployeeForm addEmployeeForm) {
		Employee employee = new Employee();
		employee.setEmployeeNo(addEmployeeForm.getEmployeeno());
		employee.setName(addEmployeeForm.getName());
		employee.setGender(addEmployeeForm.getGender());
		employee.setJoinDate(addEmployeeForm.getJd());
		employee.setMobNo1(addEmployeeForm.getMobNo1());
		employee.setMobNo2(addEmployeeForm.getMobNo2());
		employee.setAddress(addEmployeeForm.getAddress());
		budgetService.saveEmployee(employee);

		return new ModelAndView("redirect:addEmployee");
	}

	@RequestMapping(value = "deleteEmployee/{id}", method = RequestMethod.GET)
	public ModelAndView addEmployee(HttpServletRequest request,
			HttpServletResponse response, @PathVariable("id") Integer id) {
		if (id > 0) {
			budgetService.deleteEmployee(id);
		}
		return new ModelAndView("redirect:/employeeList");
	}
}
