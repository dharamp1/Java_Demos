/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating array reference
		//int  arr[];
		
		// Creating array object in heap
		//arr = new int[5];
		
		int arr[] = new int[5];
		arr[3]=34;
		arr[0]=23;
		// Accessing array
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		// Creating array without using new keyword
		double dArr [] = {45.2,76.3,78,221.76,890,-34.23};
		// Accessing array
		for(i=0;i<dArr.length;i++) {
			System.out.println(dArr[i]);
		}
		
		System.out.println("2D array:");
		
		// Creating 2D array
		int[][] arr2D = new int[2][];
		
		// Creating 1st one-D array of two-D array
		arr2D[0] = new int[5];
		
		// Creating 2nd one-D array of two-D array
		arr2D[1] = new int[2];
		
		/*
		 * arr2D[2][1] = 100; arr2D[0][3] = -23; arr2D[1][1] = 500; arr2D[2][2] = -67;
		 */
		
		//int [][]arr2D = { {2,3},{8,-4,3,11},{5,2,1}   };
		
		for(i=0;i<arr2D.length;i++) {
			for(int j=0;j<arr2D[i].length;j++) {
				System.out.print(arr2D[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// Creating array of MyDate objects
		MyDate arrDate [] = new MyDate[2];
		
		// Creating each MyDate object in array
		arrDate[0] = new MyDate();
		arrDate[1] = new MyDate(9, 6, 2021);
		
		System.out.println(arrDate[0]);
		System.out.println(arrDate[1]);
		arrDate[0].printDate();
		arrDate[1].printDate();
		
		for(i=0;i<arrDate.length;i++)
			System.out.println(arrDate[i]);
		
		
	}// end of main

}//end of class ArrayDemo
