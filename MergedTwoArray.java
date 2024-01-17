package com.demoprogram.org;

public class MergedTwoArray {

	public static int[] mergedTwoArray(int[] arr1, int[] arr2) {
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int[] mergedArray = new int[len1 + len2];
		
		for(int i = 0; i < len1; i++) {
			
			mergedArray[i] = arr1[i];
		}
		for(int i = 0; i < len2; i++) {
	
			 mergedArray[len1 + i] = arr2[i];
		}
		return mergedArray;
	}
	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10,12};
		
		int[] mergedArray = mergedTwoArray(arr1, arr2);
		
		System.out.println("Merged Array: ");
		
		for(int i = 0; i < mergedArray.length; i++) {
			
			System.out.print(mergedArray[i] + " ");
		}
		
	}
}
