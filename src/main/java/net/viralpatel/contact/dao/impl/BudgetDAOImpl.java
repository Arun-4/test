package net.viralpatel.contact.dao.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.viralpatel.contact.dao.BudgetDAO;
import net.viralpatel.contact.model.BankAccount;
import net.viralpatel.contact.model.Employee;
import net.viralpatel.contact.model.Expense;
import net.viralpatel.contact.model.Transition;
import net.viralpatel.contact.model.User;
import org.apache.commons.dbcp.BasicDataSource;

@Repository
public class BudgetDAOImpl implements BudgetDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private HttpSession httpSession;

	@Autowired
	private BasicDataSource dataSource;

	public User checkLogin(String userName, String password) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				User.class);
		criteria.add(Restrictions.eq("userName", userName));
		criteria.add(Restrictions.eq("password", password));
		return (User) criteria.list().get(0);

	}

	public void saveAccount(BankAccount bankAccount) {
		/*
		 * HibernateTemplate hibernateTemplate = new HibernateTemplate(
		 * sessionFactory); hibernateTemplate.save(bankAccount);
		 */
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(bankAccount);
	}

	@SuppressWarnings("unchecked")
	public List<BankAccount> getAccounts() {
		/*
		 * HibernateTemplate hibernateTemplate = new HibernateTemplate(
		 * sessionFactory); return (List<BankAccount>)
		 * hibernateTemplate.loadAll(BankAccount.class);
		 */
		User user = (User) httpSession.getAttribute("user");
		Session session = sessionFactory.getCurrentSession();
		return (List<BankAccount>) session.createQuery(
				"from BankAccount where user=" + user.getId()).list();
	}

	public BankAccount getAccount(int id) {
		/*
		 * HibernateTemplate hibernateTemplate = new HibernateTemplate(
		 * sessionFactory); return (BankAccount)
		 * hibernateTemplate.load(BankAccount.class, id);
		 */
		Session session = sessionFactory.getCurrentSession();
		return (BankAccount) session.load(BankAccount.class, id);
	}

	public void saveExpense(Expense expense) {
		/*
		 * HibernateTemplate hibernateTemplate = new HibernateTemplate(
		 * sessionFactory); hibernateTemplate.save(expense);
		 */
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(expense);
	}

	@SuppressWarnings("unchecked")
	public List<Expense> getExpenses() {
		/*
		 * HibernateTemplate hibernateTemplate = new HibernateTemplate(
		 * sessionFactory); return (List<Expense>)
		 * hibernateTemplate.loadAll(Expense.class);
		 */
		User user = (User) httpSession.getAttribute("user");
		Session session = sessionFactory.getCurrentSession();
		return (List<Expense>) session.createQuery(
				"from Expense where user=" + user.getId()).list();
	}

	public void saveTransition(Transition transition) {
		/*
		 * HibernateTemplate hibernateTemplate = new HibernateTemplate(
		 * sessionFactory); hibernateTemplate.save(transition);
		 */
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(transition);
	}

	public void saveRegister(User user) {
		/*
		 * HibernateTemplate hibernateTemplate = new HibernateTemplate(
		 * sessionFactory); hibernateTemplate.save(user);
		 */
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	public List<Transition> getTransactions() {
		User user = (User) httpSession.getAttribute("user");
		Session session = sessionFactory.getCurrentSession();
		return (List<Transition>) session.createQuery(
				"from Transition where user=" + user.getId()).list();
	}

	public void saveEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Employee>) session.createQuery("from Employee").list();
	}

	public void deleteEmployee(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, id);
		if (employee != null) {
			session.delete(employee);
		}
	}

	public List<Map<String, Object>> getTransitionList() {
		User user = (User) httpSession.getAttribute("user");
		String sql = "select sum(trans.credit) as credit,sum(trans.debit) as debit,bank.bankname as bankname from TRANSITION trans left outer join BANKACCOUNT bank "
				+ "on trans.bankid=bank.cid where trans.userid=? group by bank.bankname";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForList(sql, new Object[] { user.getId() });
	}
	
	public List<Map<String, Object>> getTotalExpense() {
		User user = (User) httpSession.getAttribute("user");
		String sql = "select sum(amount) as amount from EXPENSE where userid=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForList(sql, new Object[] { user.getId() });
	}
}
