package fab.the.chemist.spring.basics.springframework;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import fab.the.chemist.spring.SpringframeworkContextApplication;
import fab.the.chemist.spring.basics.BinarySearchImpl;
import fab.the.chemist.spring.cdi.CdiBusiness;
import fab.the.chemist.spring.cdi.CdiDao;


//load context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringframeworkContextApplication.class)
public class CDITest {

	//get this bean from the context
	@Autowired
	CdiBusiness cdiBusiness;
	
	@Test
	public void testBasicSearch() {
		//call method on binarusearch
		int i = cdiBusiness.findGreatest();
		//check if the value is correct
		assertEquals(89, i);
	}

}
