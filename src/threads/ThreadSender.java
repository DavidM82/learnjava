package threads;

public class ThreadSender {

	public void send(String msg) {
		System.out.println("Thread Sender: Sending\t"+ msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException iex) {
			System.out.println("Thread Sender: Sending interrupted " + iex.getMessage()); 
		}
		System.out.println("Thread Sender: message sent!");
	}
}
