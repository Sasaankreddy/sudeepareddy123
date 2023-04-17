package javaprogrammes;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		//create a string for all character
	String alp="123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	StringBuilder sb=new StringBuilder();
	Random rm=new Random();
	int length=7;
	for(int i=0;i<length;i++) {
		int index=rm.nextInt(alp.length());
		char randonchar=alp.charAt(index);
		sb.append(randonchar);
	}
	String randomstring=sb.toString();
	System.out.println("random string is: "+randomstring);
	
	
	 
		
	}
	}	

