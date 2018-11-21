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

@SpringBootApplication 
public class SpringframeworkScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkScopeApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringframeworkScopeApplication.class, args);
		
		PersonDao personDao =applicationContext.getBean(PersonDao.class);
		
		PersonDao personDao2 =applicationContext.getBean(PersonDao.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		
		/* 
		 on a persondao qui contient une variable jdbcconnection
		 
		 si on veut 2 instance de persondao et 1 de jdbcconnection , on place @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) sur persondao
		 
		 si on veut 2 instance de persondao et 2 de jdbcconnection , on place @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) sur persondao et jdbcconnection
		  
		 si on veut 1 instance de persondao et 2 de jdbcconnection , on place @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)sur jdbcconnection
		 
		  
		 * */
	}
}
