package fab.the.chemist.spring.basics.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class XMLPersonDao {
	@Autowired
	XMLJdbcConnection JdbcConnection;

	public XMLJdbcConnection getJdbcConnection() {
		return JdbcConnection;
	}

	public void setJdbcConnection(XMLJdbcConnection jdbcConnection) {
		JdbcConnection = jdbcConnection;
	}  

}
