package exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		//ee.HandleException();
		try {
			// ee.TranslationCheck();
		} catch(UnknownWordException uwe) {
			System.err.println(uwe.getMessage()); 
		} 
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime later = LocalDateTime.now().plusDays(1);
		
		if (now.isBefore(later)) {
			throw new FutureDateException(later);
		}
	}
}
