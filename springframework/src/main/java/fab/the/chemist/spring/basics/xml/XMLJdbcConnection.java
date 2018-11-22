package fab.the.chemist.spring.basics.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

public class XMLJdbcConnection {

	public XMLJdbcConnection() {
		super();
		System.out.println("Jdbc Connection");
	}
	
	

}
