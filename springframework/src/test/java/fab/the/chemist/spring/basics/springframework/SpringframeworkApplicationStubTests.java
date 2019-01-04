package fab.the.chemist.spring.basics.springframework;

import static org.junit.Assert.assertEquals;

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
public class SpringframeworkApplicationStubTests {

	@Test
	public void testFindAll() {
		BusinessImpl businessImpl = new BusinessImpl(new DataServiceStub());
		int result = businessImpl.findthegreatestvalue();
		assertEquals(6, result);
	}
	
	
	
}

class DataServiceStub implements DataService{
	
	@Override
	public int[] retrieveAll() {
		return new int[] {1,2,6};
	}

	@Override
	public int[] retrievePram(int[] arra) {
		// TODO Auto-generated method stub
		return null;
	}
}
