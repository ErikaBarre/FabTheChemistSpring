package fab.the.chemist.spring.basics.springframework;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fab.the.chemist.spring.math.Mathx;
import fab.the.chemist.spring.mockito.BusinessImpl;
import fab.the.chemist.spring.mockito.DataService;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringframeworkApplicationMockTests {

	@Test
	public void testFindAll() {
		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.retrieveAll() => new int[] {1,2,6}; 
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {1,2,6});
		
		BusinessImpl businessImpl = new BusinessImpl(dataServiceMock);
		int result = businessImpl.findthegreatestvalue();
		assertEquals(6, result);
	}
	
	
	
}


