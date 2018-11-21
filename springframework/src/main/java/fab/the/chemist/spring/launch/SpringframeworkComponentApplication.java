package fab.the.chemist.spring.launch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import fab.the.chemist.spring.basics.componentscan.ComponentDao;
import fab.the.chemist.spring.basics.scope.PersonDao;

@SpringBootApplication  //va scanner le repertoire courant et les sous repertoire => ne voit pas le package componentscan
//NoSuchBeanDefinitionException: No qualifying bean of type 'fab.the.chemist.spring.basics.componentscan.ComponentDao' available
@ComponentScan("fab.the.chemist.spring.basics.componentscan")
public class SpringframeworkComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringframeworkComponentApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringframeworkComponentApplication.class, args);
		
		ComponentDao componentDao =applicationContext.getBean(ComponentDao.class);
						
		LOGGER.info("{}", componentDao);
		
	}
}
