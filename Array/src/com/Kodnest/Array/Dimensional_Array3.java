package com.Kodnest.Array;
import java.util.Scanner;
public class Dimensional_Array3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("please enter the School");
		int s = scan.nextInt();

		System.out.println("please enter the class no");
		int c = scan.nextInt();
		System.out.println("please enter the no of students for class");
		int m = scan.nextInt(); 

		int[][][] a = new int[s][c][m];
		
		System.out.println("please enter the marks o the students");
		for(int i = 0;i<=a.length-1;i++) {
			for(int j= 0;j<=a[i].length-1;j++) {
				for(int k = 0;k<=a[i][j].length-1;k++) {

					a[i][j][k]=scan.nextInt();

				}
			}
		}
		
		System.out.println("the students marks are ");
		for(int i = 0;i<=a.length-1;i++) {
			for(int j= 0;j<=a[i].length-1;j++) {
				for(int k = 0;k<=a[i][j].length-1;k++) {

					System.out.println(a[i][j][k]);

				}
			}
		}



	}

}
