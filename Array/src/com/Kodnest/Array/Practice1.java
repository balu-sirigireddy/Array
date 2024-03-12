package com.Kodnest.Array;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		
		    
		


	}


} 








//transpose of a matrix:
/*int arr[][] = new int[2][2];
		int arr1[][]= new int[2][2];
		for(int i =0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				
				arr[i][j]=scan.nextInt();					
				}
		}
		for(int i =0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				
					System.out.print(arr[i][j]+" ");

				
				}
				System.out.println();
				
				
				}
			
		System.out.println();
		for(int i =0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				
					arr1[i][j]= arr[j][i];
					System.out.print(arr1[i][j]+" ");				
				}
				System.out.println();
							
				}
			


// reversing an array and equalling its values to another array:
/*System.out.println("enter the size of the array");
int n = scan.nextInt();
char arr[]=new char[n];
char temp[]=new char[n];
for(int i =0;i<=arr.length-1;i++) {
	arr[i]=scan.next().charAt(0);
}
for(int i =arr.length-1;i>=0;i--) {
	temp[i]=arr[i];
	System.out.print(temp[i]+" ");
}




//rotation of an array;


/*int arr[] = {1,2,3,4,5};
int k =2;
rotation(arr);                      
rotate(arr,k);

}
static void rotation(int arr[]) {



int temp = arr[0];

for(int i =1;i<=arr.length-1;i++) {
	arr[i-1]=arr[i];
}

arr[arr.length-1]=temp;
}
static void rotate(int arr[],int k ) {
/*k=k%arr.length;
if(k<0) {
	k=k+arr.length;
}
for(int i=1;i<=k;i++) {
	rotation(arr);
}
for(int i =arr.length-1;i>=0;i--) {
System.out.print(arr[i]+" ");
}*/

// subarray of the given arrray:

/*int arr[]= {1,2,3};

		for(int i =0;i<=arr.length-1;i++) {
			for(int j =i;j<=arr.length-1;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}







//solving arrays using method call:



/*int n = scan.nextInt();
		int arr[]=new int[n];

		int [] result =array(arr,n);


		for(int i =0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

		smallest(arr);
		reverse(arr);
		replace(arr);




	}
	static void smallest(int [] arr) {
		int smallest = arr[0];
		for(int i =0;i<=arr.length-1;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		System.out.print("smallest value");
		System.out.println(smallest);

	}

	static void replace(int[] arr) {
		System.out.println("reverse order");
		for(int i =0;i<=arr.length-1;i++) {
			if(arr[i]>0) {
				arr[i]=(-arr[i]);
				System.out.print(arr[i]);
			}
		}
	}
	static void reverse(int arr[]) {


		for(int i =arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}


	static int[] array(int arr[],int n) {
		Scanner scan =new Scanner(System.in);
		for(int i =0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();

		}


		return arr;

//Find out the frequency of the characters present in the string:

/*String input = "java";
		int a [] = new int [256];

		for(int i=0;i<=input.length()-1;i++) {
			a[input.charAt(i)]++;
		}

		for(int i =0;i<=a.length-1;i++) {
			if(a[i]>=1)
			System.out.println((char)i+"="+a[i]);

		}



/*String input = "java program is fun";

		String []split= input.split(" ");


		String empt = "";
		for(int i =0;i<=split.length-1;i++) {

			if(split[i].length()>empt.length()) {
				empt = split[i];
			}
		}
			System.out.println(empt);





//reversing a String by using the left and right variables:

/*String input = "The java is programming language";

		char ch [] = input.toCharArray();
		int left = 0;
		int right = ch.length-1; 

		while(left<right) {
			if(ch[left]!= ' ' && ch[right]!= ' ') {
				char temp = ch[left];
				ch[left ]=ch[right];
				ch[right]=temp;
				left++;
				right--;
			}else if(ch[left]==' '){
				left++;
			}else if(ch[right]==' ') {

				right--;
			}

		}

		System.out.println(new String(ch));




//Printing the border values of a matrix:

/*int arr [][]=new int [3][5];
Scanner scan = new Scanner(System.in);


System.out.println("Enter the elements");
for(int i =0;i<=arr.length-1;i++) {
	for(int j=0;j<=arr[i].length-1;j++) {
		arr[i][j]=scan.nextInt();
	}
}

int left=0,right=arr[0].length-1;

int top = 0,bottom = arr.length-1;

for(int i =left;i<=right;i++) {
	System.out.print(arr[top][i]+" ");
}
top++;
for(int i =top;i<=bottom;i++) {
	System.out.print(arr[i][right]+" ");
}
right--;
for(int i = right;i>=left;i--) {
	System.out.print(arr[bottom][i]+" ");
}
bottom--;
for(int i =bottom;i>=top;i--) {
	System.out.print(arr[i][left]+" ");
}
left++;
 */