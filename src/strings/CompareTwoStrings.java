package strings;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String str="welcome to java";
		String str1="welcome TO java";
		System.out.println(str.equals(str1));
System.out.println(str.equalsIgnoreCase(str1));
String s=str.replace("java","python");
System.out.println(s);
	}

}
