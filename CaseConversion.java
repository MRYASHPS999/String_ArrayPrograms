package com.jsp.strings;

public class CaseConversion {
	
	public static String caseConvert(String s) {
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char) (ch[i]+32);
			}
			else if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char) (ch[i]-32);
				
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		
		String s1="SaMsuNg";
		System.out.println(caseConvert(s1));

	}

}
