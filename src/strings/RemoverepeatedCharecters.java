package strings;

public class RemoverepeatedCharecters {
	public static void main(String[] args) {
		String input="aaabbbcdeff";
		String output=" ";
		for(int i=0;i<input.length();i++) {
			for(int j=0;j<output.length();j++) {
				if(input.charAt(i)!=output.charAt(i)){
					output=output+input.charAt(i);
				}
			}
		}
		System.out.println(output);
	}
}
