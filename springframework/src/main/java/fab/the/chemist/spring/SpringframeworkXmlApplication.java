package fab.the.chemist.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fab.the.chemist.spring.basics.BinarySearchImpl;
import fab.the.chemist.spring.basics.xml.XmlPersonDao;


public class SpringframeworkXmlApplication {

	public static void main(String[] args) {
		
		try( ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){ 
		
			XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);
			
			System.out.println(xmlPersonDao);
			System.out.println(xmlPersonDao.getXmlJdbcConnection());
		
		}
		
	}
}
