package fab.the.chemist.spring;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fab.the.chemist.spring.basics.BinarySearchImpl;
import fab.the.chemist.spring.basics.xml.XmlPersonDao;
import fab.the.chemist.spring.properties.PropertiesValues;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class SpringframeworkPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkPropertiesApplication.class);
	
	
	
	public static void main(String[] args) {
		
		try( AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringframeworkPropertiesApplication.class)){
		
			PropertiesValues propertiesImpl = applicationContext.getBean(PropertiesValues.class);
		
		
		
		System.out.println(propertiesImpl.getUrl());
		
		}
		
		
	}
}
