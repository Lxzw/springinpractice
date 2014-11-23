package springinpractice;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.l.springinpractice.domain.Customer;

/**
 * 
 * @author L-win8 
 * 2014年11月23日 -- 下午2:48:15
 *
 */
public class DomainTest {

	private static ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("Spring/bean-data.xml");
	
	private SessionFactory sessionFactory;
	
	/**
	 * 插入
	 * 
	 * 1. 插入中文
	 */
	@Test
	public void saveCustomer() {
		Customer c = new Customer();
		c.setName("小张");
		c.setCardId("330283192311052715");
		
		sessionFactory = ctx.getBean(SessionFactory.class);
		Session session  = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}
	
	/**
	 * 查询
	 * 
	 * 	1. 根据id查询
	 *  2. 根据属性查询
	 *  3. 根据多个属性查询
	 *  4. 更加对象查询
	 */
	@Test
	public void getCustomer() {
		
		sessionFactory = ctx.getBean(SessionFactory.class);
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Customer c =(Customer) session.get(Customer.class,1);
		session.getTransaction().commit();
		System.err.println(c.getCardId());
	}


}
