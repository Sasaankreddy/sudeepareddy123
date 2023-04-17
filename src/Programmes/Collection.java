package Programmes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		List<String> student=new ArrayList<String>();
		student.add("sudeepa");
		student.add("sudheer");
		student.add(null);
		student.add(1,"hello");
		boolean b=student.contains("sudeepa");
		System.out.println(b);
		String str=student.get(0);
		System.out.println(str);
		/*for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));
		}*/
		/*for(String i:student) {
			System.out.println(i);
		}*/
		Iterator<String>itr=student.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
