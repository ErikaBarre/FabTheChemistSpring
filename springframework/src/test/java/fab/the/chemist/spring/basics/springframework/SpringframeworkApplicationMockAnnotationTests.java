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
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fab.the.chemist.spring.math.Mathx;
import fab.the.chemist.spring.mockito.BusinessImpl;
import fab.the.chemist.spring.mockito.DataService;


//regarde la presence des mockito annotation junit en vue de les initialiser
@RunWith(MockitoJUnitRunner.class)
public class SpringframeworkApplicationMockAnnotationTests {

	//permet d'instancier dataservice
	@Mock
	DataService dataServiceMock;
	
	//l'annotation permet d'instencier businessimpl ET d'injecter dataservice qui est instancier dans la ligne du dessus
	@InjectMocks
	BusinessImpl businessImpl;
	
	@Test
	public void testFindAll() { 
		//on inject un tableau qui est notre jeu de varialbe 
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {1,2,6});
		int result = businessImpl.findthegreatestvalue();
		assertEquals(6, result);
	}
	
	
	
}


