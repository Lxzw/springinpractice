package springinpractice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataTest {

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring/bean-data.xml");
	
	@Test
	public void test() {

	}

}
