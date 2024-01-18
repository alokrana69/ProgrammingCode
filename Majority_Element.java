//Question1.
//Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
//Output : 4
//Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 
//
//Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
//Output : No Majority Element
//Explanation: There is no element whose frequency is greater than the half of the size of the array size.


package com.demoprogram.org;

public class Majority_Element {

	public static int majorityElement(int[] arr, int n) {
		
		int el = 0;
	 
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(count == 0) {
				
				el = arr[i];
			}
			if(el == arr[i]) {
				
				count++;
				
			}
			else {
				count--;
			}
		}
		count = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(el == arr[i]) {
				
				count++;
			}
		}
		if(count > n/2) {
			
			return el;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		int n = 3;
		
		int result = majorityElement(arr, n);
		System.out.print(result);
 	}
}
