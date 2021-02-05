package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

	String fileName;
	File file;
	
	public FileHandler(String fileName) {
		this.fileName = fileName;
		this.file = new File(fileName);
	}
	
	//read
	public boolean readFile() { 
		Scanner scan = new Scanner("");
		try {
			if (file.exists() && file.canRead()) {
				System.out.println("Reading from file...");
				scan.close();
				scan = new Scanner(file);
				while (scan.hasNextLine()) {
					System.out.println(scan.nextLine());
				}
				scan.close();
				return true;
			} else {
				System.out.println("File not found or is unreadable.");
			}
		} catch(IOException ioe) {
			scan.close();
			System.out.println("Error reading from file: " + ioe.getMessage());
		}
		return false;
	}
	
	//write
	public boolean writeFile(String content) { 
		FileWriter fw;
		
		if (file.exists() && file.canRead()) {
			try {
				fw = new FileWriter(file);
				fw.write(content);
				fw.close();
				return true;
			} catch (IOException ioe) {
				System.out.println("Error writing to file..." + ioe.getMessage());
			}
		} else {
			System.out.println("File not found or is unwritable.");
		}
		return false;
	}
	
	//append
	public boolean appendFile(String textToAppend) {
		FileWriter fw;
		if (file.exists() && file.canWrite()) {
			try {
				fw = new FileWriter(file,true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(textToAppend);
				bw.close();
				fw.close();
				return true;
			} catch (IOException ioe) {
				System.out.println("Could not append to the file... " + ioe.getMessage());
			}
		} else {
			System.out.println("File not found or is unwritable.");
		}
		return false;
	}
	
	//delete file
	public boolean deleteFile() {
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("File deleted.");
				return true;
			} else {
				System.out.println("File could not be deleted");
			}
		} else {
			System.out.println("File could not be found.");
		}
		return false;
	}
	
	//create the file
	public boolean createFile() {
		if (file.exists()) {
			System.out.println("File already exists!");
			return false;
		}
		try {
			if (file.createNewFile()) {
				System.out.println("File created!");
				return true;
			} else {
				System.out.println("File could not be created.");
			}
		} catch (IOException ioe) {
			System.out.println("Error creating a new file... " + ioe.getMessage());
		}
		return false;
	}
	
	//create a new file
	public boolean newFile(String fileName) {
		File testfile = new File(fileName);
		if (testfile.exists()) {
			System.out.println("File already exists!");
			return false;
		}
		this.file = testfile;
		this.fileName = fileName;
		return this.createFile();
	}
}
