package edu.miu.cs.cs425.lab10.testarrayflattenerapp;

import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {
	public int[] flatternArray(int[][] a) {
		if(a==null)
			return null;
		return Arrays.stream(a).flatMapToInt(x->Arrays.stream(x)).toArray();		
	}
}
