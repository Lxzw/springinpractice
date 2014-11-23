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
 * 2014��11��23�� -- ����2:48:15
 *
 */
public class DomainTest {

	private static ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("Spring/bean-data.xml");
	
	private SessionFactory sessionFactory;
	
	/**
	 * ����
	 * 
	 * 1. ��������
	 */
	@Test
	public void saveCustomer() {
		Customer c = new Customer();
		c.setName("С��");
		c.setCardId("330283192311052715");
		
		sessionFactory = ctx.getBean(SessionFactory.class);
		Session session  = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}
	
	/**
	 * ��ѯ
	 * 
	 * 	1. ����id��ѯ
	 *  2. �������Բ�ѯ
	 *  3. ���ݶ�����Բ�ѯ
	 *  4. ���Ӷ����ѯ
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
