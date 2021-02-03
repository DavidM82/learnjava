package exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FutureDateException extends RuntimeException{

	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	
	FutureDateException(LocalDateTime date){
		super("Cannot process this order as " + dtf.format(date) + " hasn't happened yet!");
	}
}
