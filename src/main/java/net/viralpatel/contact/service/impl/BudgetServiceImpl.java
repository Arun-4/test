package net.viralpatel.contact.service.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.Transient;

import net.viralpatel.contact.dao.BudgetDAO;
import net.viralpatel.contact.model.BankAccount;
import net.viralpatel.contact.model.Employee;
import net.viralpatel.contact.model.Expense;
import net.viralpatel.contact.model.Transition;
import net.viralpatel.contact.model.User;
import net.viralpatel.contact.service.BudgetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BudgetServiceImpl implements BudgetService {

	@Autowired
	private BudgetDAO budgetDao;

	@Transactional
	public User checkLogin(String userName, String password) {
		return budgetDao.checkLogin(userName, password);
	}

	@Transactional
	public void saveAccount(BankAccount bankAccount) {
		budgetDao.saveAccount(bankAccount);
	}

	@Transactional
	public List<BankAccount> getAccounts() {
		return budgetDao.getAccounts();
	}

	@Transactional
	public BankAccount getAccount(int id) {
		return budgetDao.getAccount(id);
	}

	@Transactional
	public void saveExpense(Expense expense) {
		budgetDao.saveExpense(expense);
	}

	@Transactional
	public List<Expense> getExpenses() {
		return budgetDao.getExpenses();
	}

	@Transactional
	public void saveTransition(Transition transition) {
		budgetDao.saveTransition(transition);
	}

	@Transactional
	public void saveRegister(User user) {
		budgetDao.saveRegister(user);
	}

	@Transactional
	public List<Transition> getTransactions() {
		return budgetDao.getTransactions();
	}
	
	@Transactional
	public void saveEmployee(Employee employee){
		budgetDao.saveEmployee(employee);
	}
	
	@Transactional
	public List<Employee> getEmployees(){
		return budgetDao.getEmployees();
	}
	
	@Transactional
	public void deleteEmployee(int id){
		budgetDao.deleteEmployee(id);
	}
	
	@Transactional
	public List<Map<String, Object>> getTransitionList(){
		return budgetDao.getTransitionList();
	}
	
	@Transactional
	public List<Map<String, Object>> getTotalExpense(){
		return budgetDao.getTotalExpense();
	}
}
