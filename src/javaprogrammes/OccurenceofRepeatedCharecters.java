package javaprogrammes;

import java.util.HashMap;

public class OccurenceofRepeatedCharecters {

	public static void main(String[] args) {
		String str="i am attending interview";
		while(str.length()>0) {
			char c=str.charAt(0);
			String str1=str.replace(c+"","");
			int count=str.length()-str1.length();
			System.out.println(c+"="+count);
			str=str1;
		}
	}
}