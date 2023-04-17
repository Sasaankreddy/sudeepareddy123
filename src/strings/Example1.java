package strings;

public class Example1 {

	public static void main(String[] args) {
		String s="hello world";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb2=sb.append(" welcome");
		System.out.println(sb2);
		System.out.println(sb.reverse());
		
	}

}
