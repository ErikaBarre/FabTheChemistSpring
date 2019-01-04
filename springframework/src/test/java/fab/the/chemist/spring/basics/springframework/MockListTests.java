package fab.the.chemist.spring.basics.springframework;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class MockListTests {

	@Test
	public void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}


	@Test
	public void testSize2() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}
	
	@Test
	public void testget() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("aaaa");
		assertEquals("aaaa", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void testget2() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn(10);
		assertEquals(10, listMock.get(0));
		assertEquals(10, listMock.get(1));
	}
	
}
