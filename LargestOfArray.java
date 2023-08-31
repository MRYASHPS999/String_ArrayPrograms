package com.jsp.arrays_program;

public class LargestOfArray {
	
	public static int largestElement(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest = arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		
		int a[]= {87,76,54,324,56777,78901,485845,7474848};
		
		System.out.println("Largest element is:" + largestElement(a));
		

	}

}
