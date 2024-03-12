package com.Kodnest.Array;

public class Dimensional_Array_Matrix {
	public static void main(String[] args) {
		int[][] a = new int[4][4];
		a[0][0]=3;
		a[0][1]=42;
		a[0][2]=74;
		a[0][3]=94;
		
		a[1][0]=13;
		a[1][1]=7;
		a[1][2]=99;
		a[1][3]=4;
		
		a[2][0]=8;
		a[2][1]=14;
		a[2][2]=67;
		a[2][3]=30;
		
		a[3][0]=41;
		a[3][1]=7;
		a[3][2]=18;
		a[3][3]=30;
		
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
