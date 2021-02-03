package file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	private File file;
	
	public void CreateFile(String fileName) {
		
		try {
			file = new File(fileName);
			if (file.exists()) {
				System.out.println("The file exists!");
				return;
			}
			System.out.println("The file does not exist.");
			file.createNewFile();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			
		}
	}
}
