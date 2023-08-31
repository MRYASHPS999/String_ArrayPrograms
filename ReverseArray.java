package com.jsp.arrays_program;

public class ReverseArray {
	
	public static void reverseArray(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,56,213};
		
		reverseArray(a);
	}

}
