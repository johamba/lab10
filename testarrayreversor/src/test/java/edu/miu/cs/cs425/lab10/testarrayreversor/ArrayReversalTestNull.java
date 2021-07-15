package edu.miu.cs.cs425.lab10.testarrayreversor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab10.testarrayreversor.service.ArrayFlattenerService;

public class ArrayReversalTestNull {
	ArrayReversor arrayReversor;
	ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

	@Before
	public void setUp() throws Exception {
		arrayReversor = new ArrayReversor(arrayFlattenerService);
	}

	@After
	public void tearDown() throws Exception {
		arrayReversor = null;
	}

	@Test
	public void test() {
		when(arrayFlattenerService.flattenArray(null)).thenReturn(null);
		assertArrayEquals(null, arrayReversor.reverseArray(null));
	}
}
