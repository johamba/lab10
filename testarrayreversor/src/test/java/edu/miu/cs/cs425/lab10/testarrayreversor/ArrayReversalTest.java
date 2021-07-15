package edu.miu.cs.cs425.lab10.testarrayreversor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab10.testarrayreversor.service.ArrayFlattenerService;

public class ArrayReversalTest {
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
	public void arrayReversorTest1() {
		int[][] a_in = {{1,3}, {0}, {4,5,9}}; 
		int[] a_in_flat= {1,3,0,4,5,9};
		int[] a_out = {9,5,4,0,3,1}; 
		
		when(arrayFlattenerService.flattenArray(a_in)).thenReturn(a_in_flat);
		assertArrayEquals(a_out, arrayReversor.reverseArray(a_in));
		verify(arrayFlattenerService).flattenArray(a_in);
	}
}
