package filehandling;

public class RunFileHandler {

	public static void main(String[] args) {
		FileHandler fh = new FileHandler("test.txt");
		fh.createFile();
		fh.writeFile("Check one two, writing to this file works!");
		fh.readFile();
		System.out.println("Appending to the file...");
		fh.appendFile(" Let's add some more content!");
		fh.readFile();
		fh.deleteFile();
		fh.newFile("testy.txt");
		fh.writeFile("A new file appears!");
		fh.readFile();
		fh.deleteFile();
	}

}
