package file;

public class runFileExample {

	public static void main(String[] args) {
		FileExample fe = new FileExample();
		fe.DeleteFileIfExists("test.txt");
		fe.CreateFile("test.txt");
		fe.WriteFile("This works!", "test.txt");
		
	}
}
