package searchemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEmail {
	
	private final String regex = "[a-z,A-Z,0-9]+@+[a-z]+.+[a-z]";
	private final Pattern pattern = Pattern.compile(regex);
	private Matcher match;
	private String[] emailList = new String[5];
	
	public FindEmail() {
		emailList[0] = "bobross@paint.com";
		emailList[1] = "charliechaplin@humor.net";
		emailList[2] = "davidbowie@music.com";
		emailList[3] = "edwardsnowden@leak.gov";
		emailList[4] = "franksinatra@my.way";
	}
	
	
	public void findEmail(String input) {
		System.out.print("Input being verified: ");
		System.out.println(input);				
		match = pattern.matcher(input);
		if (match.find()) {
			System.out.println("Valid Email! Checking in table...");
			for (int i = 0; i < emailList.length; i++) {
				if (input.equals(emailList[i])) {
					System.out.println("Email found at index: " + i + "!\n");
					return;
				}
			}
			System.out.println("Email not found!\n");
		} else {
			System.out.println("Not a valid email!\n");
		}
	}
	
	public void printEmails() {
		for (int i = 0; i < emailList.length; i++) {
			System.out.println(emailList[i].toString());
		}
		System.out.println("\n");
	}
}
