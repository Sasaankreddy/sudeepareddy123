
package Programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingArray {

	public static void main(String[] args) {
	int array[]= {1,2,2,2,3,4,5,6};
	System.out.println(array.length);
//n determine the no.of times an array should be 	 
	int n=3;
	 //displays original array
	System.out.print("Original Array:");
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]+" ");
	}
	
	//rotate the given array by n timestowards left
	for(int i=0;i<n;i++) {
		int j;
		int first;
		//stores the first element of array
		first=array[0];
		for(j=0;j<array.length-1;j++) {
			//shift element of array by one
			array[j]=array[j+1];
			
		}
		//first element of array will be added to the end
		array[j]=first;
		System.out.println();
		//displays resulting array after rotation
		System.out.println("array after left rotation");
		for(int a=0;a<array.length;a++) {
			System.out.println(array[a]+" ");
			
		}
		
		
	}

}
}
