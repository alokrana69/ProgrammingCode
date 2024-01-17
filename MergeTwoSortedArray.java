package com.demoprogram.org;

public class MergeTwoSortedArray {

	public static int[] mergeTwoSorted(int[] arr1, int[] arr2) {
		
		int len1 = arr1.length; 
		int len2 = arr2.length;
		
		int[] mergedArray = new int[len1 + len2];
		
		int i = 0, j = 0, k = 0;
		
		//compare element from both array and merged them in sorted order...
		 while(i < len1 && j < len2) {
			 
			 if(arr1[i] < arr2[j]) {
				 
				 mergedArray[k++] = arr1[i++];
			 }
			 else {
				 mergedArray[k++] = arr2[j++];
			 }
		 }
		 // if there are remaining element isn arr1 copy them to merged array..
		 while(i < len1) {
			 
			 mergedArray[k++] = arr1[i++];
		 }
		// if there are remaining element in arr2 copy them to merged array...
		 while(j < len2) {
			 
			 mergedArray[k++] = arr2[j++];
		 }
		 return mergedArray;
	}
	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10,12};
		
		int[] mergedArray = mergeTwoSorted(arr1, arr2);
		
		System.out.println("Merged Array: ");
		
		for(int i = 0; i < mergedArray.length; i++) {
			
			System.out.print(mergedArray[i] + " ");
			
		}
	}
}
