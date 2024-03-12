package com.Kodnest.Array;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("please enter the  number of classes");
		int m = scan.nextInt();
		System.out.println("please enter the number of students");
		int n = scan.nextInt();
		
		int[][] a = new int[m][n];
		
		for(int i= 0;i<=a.length-1;i++ ) {
			for(int j =0;j<=a[i].length-1;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("to display the elements of the 2d array");
		for(int i= 0;i<=a.length-1;i++ ) {
			for(int j =0;j<=a[i].length-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Even elements");
		for(int i= 0;i<=a.length-1;i++ ) {
			for(int j =0;j<=a[i].length-1;j++) {
				if(a[i][j]%2==0) {
				System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Principle diagonal");
		for(int i= 0;i<=a.length-1;i++ ) {
			for(int j =0;j<=a[i].length-1;j++) {
				if(i==j) {
				System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println("Secondary diagonal");
		for(int i= 0;i<=a.length-1;i++ ) {
			for(int j =0;j<=a[i].length-1;j++) {
				if((i+j== a.length-1)) {
				System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}*/
		
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][0]=4;
		a[1][1]=5;
		
		b[0][0]=4;
		b[0][1]=7;
		
		b[1][0]=8;
		b[1][1]=7;
		
		
		for(int i =0;i<=a.length-1;i++) {
			for(int j = 0;j<=a.length-1;j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	

}
