package fab.the.chemist.spring.basics.springframework;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import fab.the.chemist.spring.SpringframeworkContextApplication;
import fab.the.chemist.spring.basics.BinarySearchImpl;


//load context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/applicationContextTest.xml")
public class BinarySearchXMLTest {

	//get this bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void testBasicSearch() {
		//call method on binarusearch
		int i = binarySearchImpl.binarySearch(new int[] {1,2,5,10,26}, 5);
		//check if the value is correct
		assertEquals(3, i);
	}

}
