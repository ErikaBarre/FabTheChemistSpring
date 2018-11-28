package fab.the.chemist.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fab.the.chemist.spring.basics.BinarySearchImpl;
import fab.the.chemist.spring.basics.xml.XmlPersonDao;


public class SpringframeworkXmlApplication2 {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkXmlApplication2.class);
	
	public static void main(String[] args) {
		
		
		
		try( ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext2.xml")){ 
		
			LOGGER.info("{}",		
			applicationContext.getBeanDefinitionNames());
			
			LOGGER.info("{}",		
					(Object)applicationContext.getBeanDefinitionNames());
			
			XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);
			
			LOGGER.info("{}",xmlPersonDao);
			LOGGER.info("{}",xmlPersonDao.getXmlJdbcConnection());
		
		}
		
	}
}
