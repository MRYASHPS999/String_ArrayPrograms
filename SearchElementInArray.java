package com.jsp.arrays_program;

public class SearchElementInArray {
	
	public static boolean eleIsPresent(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return true;
			}
			
		}return false;
	}

	public static void main(String[] args) {
		
		int a[]= {12,34,56,76,432,890,3456,2312};
		
		System.out.println(eleIsPresent(a,321));
		

	}

}
