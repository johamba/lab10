package edu.miu.cs.cs425.lab10.testarrayflattenerapp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTestData {
	ArrayFlattener arrayFlattener;

	@Before
	public void setUp() throws Exception {
		arrayFlattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		arrayFlattener = null;
	}

	@Test
	public void test() {
		int[][] input = { { 1, 2 }, { 6, 3 }, { 7, 9, 4 } };
		int[] eo = { 1, 2, 6, 3, 7, 9, 4 };
		int[] actual = arrayFlattener.flatternArray(input);
		assertThat(actual, is(eo));
	}

}
