package net.viralpatel.contact.dao;

import java.util.List;
import java.util.Map;

import net.viralpatel.contact.model.BankAccount;
import net.viralpatel.contact.model.Employee;
import net.viralpatel.contact.model.Expense;
import net.viralpatel.contact.model.Transition;
import net.viralpatel.contact.model.User;

public interface BudgetDAO {

	public User checkLogin(String userName, String password);

	public void saveAccount(BankAccount bankAccount);

	public List<BankAccount> getAccounts();

	public BankAccount getAccount(int id);

	public void saveExpense(Expense expense);

	public List<Expense> getExpenses();

	public void saveTransition(Transition transition);

	public void saveRegister(User user);

	public List<Transition> getTransactions();

	public void saveEmployee(Employee employee);

	public List<Employee> getEmployees();

	public void deleteEmployee(int id);

	public List<Map<String, Object>> getTransitionList();

	public List<Map<String, Object>> getTotalExpense();
}
