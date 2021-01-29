package collections;

import java.util.ArrayList;
import java.util.HashMap;

import inner.InnerClassExample;

public class LearnJavaAppLication {

	public static void main(String[] args) {
		
		System.out.println("Check one two");
		
		ArrayList<HashMap<String, String>> students = new ArrayList<HashMap<String, String>>(); 
		
		HashMap<String, String> david = new HashMap<String, String>();
		david.put("name", "David");
		david.put("address", "123 Main Street");
		
		HashMap<String, String> bob = new HashMap<String, String>();
		bob.put("name", "Bob");
		bob.put("address", "456 Lane Lane");
		
		students.add(david);
		students.add(bob);
		
		for (HashMap<String, String> i: students) {
			System.out.println(i.get("name")); 
		}
		
		
		InnerClassExample innerClassExample = new InnerClassExample("test1");
		System.out.println(innerClassExample.getMyMember1());
		innerClassExample.userMyInnerClass();
		
		
	}
}
