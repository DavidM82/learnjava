package exceptions;

public class ExceptionExample {

	String correctInt = "3", incorrectInt = "abc";
	String improperTranslate = "Hola!", properTranslate = "Hello There!";
	
	
	public void HandleException() {
		try {
			int correct = Integer.parseInt(correctInt);
			//int incorrect = Integer.parseInt(incorrectInt);			
		} catch(NumberFormatException nfe) {
			System.out.println("Error formmating a number... " + nfe.getMessage());
			//System.exit(1);
		} finally{
			System.out.println("We're done with this program!");
		}
	}
	
	public void TranslationCheck() throws UnknownWordException {
		if(!improperTranslate.equals(properTranslate)) {
			throw new UnknownWordException(improperTranslate);
		}
	}
}
