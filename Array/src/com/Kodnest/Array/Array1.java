package com.Kodnest.Array;
import java.util.Scanner;
public class Array1 {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter the value of size");
		int size=scan.nextInt();
		int[] a = new int[5];
		System.out.println("enter the marks "+ size+" people ");
		for(int i = 0;i<=size-1;i++) {
			a[i]=scan.nextInt();
			
		}
		for(int i = 0;i<=size-1;i++) {
			System.out.println(a[i]);
		}
		
	}

}
