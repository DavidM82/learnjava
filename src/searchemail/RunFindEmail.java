package searchemail;

public class RunFindEmail {
	
	public static void main(String[] args) {
		FindEmail find = new FindEmail();
		System.out.println("Current emails in the table:"); 
		find.printEmails();
		
		//checks that at least one argument is passed in, takes the first one.
		if(args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				find.findEmail(args[i]);
			}
			
			
		} else {
			System.out.println("No input found. Please put in at least one email.");
		}
	}
}
