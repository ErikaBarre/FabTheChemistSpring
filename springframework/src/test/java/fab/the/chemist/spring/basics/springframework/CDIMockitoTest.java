package fab.the.chemist.spring.basics.springframework;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import fab.the.chemist.spring.SpringframeworkContextApplication;
import fab.the.chemist.spring.basics.BinarySearchImpl;
import fab.the.chemist.spring.cdi.CdiBusiness;
import fab.the.chemist.spring.cdi.CdiDao;


//load context
@RunWith(MockitoJUnitRunner.class)
public class CDIMockitoTest {

	@Mock
	CdiDao cdiDaoMock;
	
	//get this bean from the context
	@InjectMocks
	CdiBusiness cdiBusiness;
	
	@Test
	public void testBasicSearch() {
		
		when(cdiDaoMock.getData()).thenReturn(new int[] {1,5,829});
		
		assertEquals(829, cdiBusiness.findGreatest());
	}

}
