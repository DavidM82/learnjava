package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	private File file;
	
	public File CreateFile(String fileName) {

		try {
			file = new File(fileName);
			if (file.exists()) {
				System.out.println("The file exists!");
			}
			System.out.println("The file does not exist.");
			file.createNewFile();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return file;
	}
	
	public void DeleteFileIfExists(String fileName) {
		boolean status;
		try {
			file = new File(fileName);
			if(file.exists()) {
				status = file.delete();
				if (status) {
					System.out.println("Deleted");
				} else {
					System.out.println("failed to delete file: " + fileName);
				}
			}
		} catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
	
	public void WriteFile(String textToWrite, String file) {
		FileWriter writer = null;
		try{
			writer = new FileWriter(new File(file));
			writer.write(textToWrite);
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		} finally {
			try {
				writer.close();	
			} catch (IOException ioe) {
				System.err.println(ioe.getMessage());
			}
		}
	}
}
