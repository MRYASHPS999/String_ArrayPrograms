package com.jsp.strings;

public class ReverseString {
	public static String strrev(String s) {
		String rev=" ";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		return rev;
	}

	public static void main(String[] args) {
		String s1="New String";
		System.out.println(strrev(s1));

	}

}
