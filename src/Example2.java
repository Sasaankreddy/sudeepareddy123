
public class Example2 {
	public static void main(String[] args) {
		Example1 eg=new Example1();
		int i=eg.a=10;
		System.out.println("non static: "+i);
		System.out.println("non static 2:"+(eg.a=30));
		
	}
	

}
