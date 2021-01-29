package methods;

import java.util.ArrayList;

public class learnMethods {
	
	private static int returnAnInt(float a) { return (int) a;}
	
	private static int returnAnInt(double a) {return (int) a;}
	
	public static void main(String[] args) {
		
		double myDouble = 5.0;
		float myFlaot = 4.0f;
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Mary", "Smith")); 
		
		for (Person thisPerson: people) {
			System.out.println(thisPerson.firstName);
		}
		
		System.out.println(returnAnInt(myDouble));
		System.out.println(returnAnInt(myFlaot));
	}
}
