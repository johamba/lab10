package edu.miu.cs.cs425.lab10.testarrayflattenerapp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTestNull {
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
		assertThat(new int[] {9,0}, is(arrayFlattener.flatternArray(null)));
	}
}
