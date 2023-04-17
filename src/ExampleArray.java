
public class ExampleArray {
	//int array[]= {10,20,20,30,10};
	/*public static void method1() {
		int array[]= {10,20,20,30,10};
		int i=array.length;
		System.out.println(i);	
	}*/
	

	public static void main(String[] args) {
		int array[]= {10,20,100,40,50};
		int large=0;
		large=array[0];
		for(int i=1;i<array.length;i++) {
			if(large<array[i]) {
				large=array[i];
			}
		}
		System.out.println(large);
		}

}

