/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class ForEachLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		arr[3]=34;
		arr[0]=23;
		
		// iterating over array using forEach loop
		
		for(int ele:arr )
			System.out.println(ele);
		
		System.out.println();
		// Creating 2D array
		int[][] arr2D = new int[2][];
		
		// Creating 1st one-D array of two-D array
		arr2D[0] = new int[5];
		
		// Creating 2nd one-D array of two-D array
		arr2D[1] = new int[2];
		
		for(int[] v:arr2D) {
			for(int ele: v) 
				System.out.print(ele +" ");
			System.out.println();
		}
		
		// Creating array of MyDate objects
		MyDate arrDate [] = new MyDate[2];
		
		// Creating each MyDate object in array
		arrDate[0] = new MyDate();
		arrDate[1] = new MyDate(9, 6, 2021);
		
		// iterating over array of MyDate object
		for(MyDate ob:arrDate)
			System.out.println(ob);
		
	}

}
