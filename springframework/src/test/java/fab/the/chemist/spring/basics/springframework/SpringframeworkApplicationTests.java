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

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringframeworkApplicationTests {

	Mathx math = new Mathx();
	
	@Before
	public void before() {
		System.out.println("before");
	}
	@After
	public void after() {
		System.out.println("after");
	}
	
	
	@BeforeClass
	public static void beforec() {
		System.out.println("before class");
	}
	@AfterClass
	public static void afterc() {
		System.out.println("after class");
	}
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void mathTest() {
		System.out.println("mathTest");
		int[] numbers = {1,2,3};
		
		int actual = math.sum(numbers);
		
		assertEquals(6, actual);
	}

	@Test
	public void mathTest0() {
		System.out.println("mathTest0");
		int[] numbers = {3};
		
		int actual = math.sum(numbers);
		
		assertEquals(3, actual);
	}
	
}
