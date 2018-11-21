package fab.the.chemist.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import fab.the.chemist.spring.basics.scope.PersonDao;
import fab.the.chemist.spring.cdi.CdiBusiness;

@SpringBootApplication 
public class SpringframeworkCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkCdiApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringframeworkCdiApplication.class, args);
		
		CdiBusiness cdiBusiness =applicationContext.getBean(CdiBusiness.class);
		
		
		
		LOGGER.info("{}", cdiBusiness);
		LOGGER.info("{}", cdiBusiness.getCdiDao());

	}
}
