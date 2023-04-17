package exampleInterface;

public class ChildAbstract extends ExampleAbstraction {

	public static void main(String[] args) {
		ChildAbstract obj=new ChildAbstract();
		obj.method1();
		obj.method2(20,20);
		obj.method3();
		

	}

	@Override
	void method1() {
		System.out.println("this is abstract method");
		
	}

	@Override
	void method2(int a, int b) {
		System.out.println(a+b);
		
	}

}
