package edu.miu.cs.cs425.lab10.testarrayreversor;

import edu.miu.cs.cs425.lab10.testarrayreversor.service.ArrayFlattenerService;

public class ArrayReversor {

	private ArrayFlattenerService arrayFlattenerService;

	public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
		this.arrayFlattenerService = arrayFlattenerService;
	}

	int[] reverseArray(int[][] twoD) {

		if (twoD == null)
			return null;

		int[] a = arrayFlattenerService.flattenArray(twoD);
		
		int n = a.length;
		int[] b = new int[n];
		
		for (int i = 0; i < n; i++) {
			b[i] = a[n - 1 - i];
		}		
		return b;
	}
}
