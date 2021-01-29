package String;

public class StringExample {

	private String myName = "David";
	
	public void TestStrings() {
		System.out.println(myName);
		
		System.out.println(myName+"-wavey");
		
		StringBuffer buffer = new StringBuffer(myName);
		StringBuilder builder = new StringBuilder(myName);
		
		buffer.append("-wavey");
		builder.append("-wavey");
		
		System.out.println(buffer.toString());
		System.out.println(builder.toString());
	}
}
