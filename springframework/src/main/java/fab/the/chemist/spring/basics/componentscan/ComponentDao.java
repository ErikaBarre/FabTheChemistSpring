package fab.the.chemist.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import fab.the.chemist.spring.basics.scope.JdbcConnection;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDao {
	@Autowired
	ComponentJdbcConnection JdbcConnection;

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return JdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		JdbcConnection = jdbcConnection;
	}  

}
