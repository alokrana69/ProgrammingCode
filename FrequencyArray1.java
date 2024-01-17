package com.demoprogram.org;

public class FrequencyArray1 {

	public static void main(String[] args) {
		
		 int[] arr = {1,2,3,4,2,1,5,3,2,4,1,5,5};
		 
		 //array to store frequencies initialized to -1
		 int[] freq = new int[arr.length];
		 
		 for(int i = 0; i < freq.length; i++) {
			 
			 freq[i] = -1;
		 }
		 //calculate frequency of each element...
		 for(int i = 0; i < arr.length; i++) {
			 
			 int count = 1;
			 
			 for(int j = i + 1; j < arr.length; j++) {
				 
				 if(arr[i] == arr[j]) {
					 
					 count++;
					 //to avoid count the same element..
					 freq[j] = 0;
				 }
			 }
			 //if frequency of the current elments is not counted
			 if(freq[i] != 0) {
				 freq[i] = count;
			 }
		 }
		 //display the frequency of each element..
		 for(int i = 0; i < freq.length; i++) {
			 
			 if(freq[i] != 0) {
				 
				 System.out.println(arr[i] + " " + freq[i]);
			 }
		 }
	}
}
