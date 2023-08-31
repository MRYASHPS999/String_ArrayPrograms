package com.jsp.arrays_program;

public class SumOfElements {
	
	public static void sumOfArrElements(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("Sum is:" + sum);
			
	}

	public static void main(String[] args) {
		int a[]= {23,34,56,78,90,32,341,4532,2589};
		sumOfArrElements(a);
		

	}

}

