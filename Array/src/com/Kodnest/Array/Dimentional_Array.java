package com.Kodnest.Array;
import java.util.Scanner;
public class Dimentional_Array {
	public static void main(String[]args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("please enter the no of classes");
		int c = scan.nextInt();
		System.out.println("please enter the no of students");
        int s = scan.nextInt();
		int[][] a = new int[c][s];
		/*a[0][0]=20;
		a[0][1]=25;
		a[0][2]=30;
		a[0][3]=40;
		a[0][4]=35;

		a[1][0]=45;
		a[1][1]=90;
		a[1][2]=60;
		a[1][3]=55;
		a[1][4]=50;*/
		System.out.println("please enter the marks");

		for(int j = 0;j<=a.length-1;j++) {


			for(int i = 0;i<=a[j].length-1;i++) {
				a[j][i]=scan.nextInt();


			}
		}
			System.out.println("please enter the values for the second class");

			for(int j = 0;j<=a.length-1;j++) {

				for(int i = 0;i<=a[j].length-1;i++) {
					a[j][i]=scan.nextInt();

			}

		}

	}

	}


