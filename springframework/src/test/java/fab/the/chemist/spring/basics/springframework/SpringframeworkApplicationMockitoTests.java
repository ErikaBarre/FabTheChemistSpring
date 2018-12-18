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

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringframeworkApplicationMockitoTests {

	@Test
	public void testFindAll() {
		BusinessImpl businessImpl = new BusinessImpl();
		businessImpl.findthegreatestvalue();
	}
	
}
