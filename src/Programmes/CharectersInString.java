package Programmes;

import java.util.Scanner;

public class CharectersInString {

	public static void main(String[] args) {
	String str="hello i am sudeepa";
		
		
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			count++;
		}
		
	}
	System.out.println("total characters in String:"+count);	

	}

}

