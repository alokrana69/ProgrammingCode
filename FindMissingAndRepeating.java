//Question:- 

 // Find Missing And Repeating
// Input:
//N = 2
//Arr[] = {2, 2}
//Output: 2 1
//Explanation: Repeating number is 2 and 
//smallest positive missing number is 1.


package com.demoprogram.org;

public class FindMissingAndRepeating {

	static int[] findMissingAndRepeating(int[] arr, int n) {
		
		int[] result = new int[2];
		
		//find the repeating element...
		for(int i = 0; i < n; i++) {
			
			int index = Math.abs(arr[i])-1;
			
			if(arr[index] > 0) {
				
				arr[index] = -arr[index];
			}
			else {
				result[0] = Math.abs(arr[i]);
			}
		}
		//find the missing element
		for(int i = 0; i < n; i++) {
			
			if(arr[i] > 0) {
				result[1] = i + 1;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
		int n = 3;
		
		int[] arr = {1,3,3};
		
		int[] result = findMissingAndRepeating(arr, n);
		
		System.out.println(result[0] + " " + result[1]);
	}
}
