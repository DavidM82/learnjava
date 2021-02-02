package threads;

public class RunThread {

	public static void main(String[] args) {
		RunnableThread rt = new RunnableThread();
		Thread te = new Thread(rt);
		te.start();
		while(RunnableThread.myCount <= 10){
			try{
				System.out.println("MAIN: Main Thread: "+(++RunnableThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex){
				System.out.println("MAIN:Exception in main thread: "+iex.getMessage());
			}
		}
		System.out.println("MAIN: End of Main Thread...");
		
		System.out.println("Start of ThreadSleepWaitExample"); 
		
		try {
			Thread.sleep(1000);
			ThreadSleepWaitExample.RunSleepWait();
		} catch (InterruptedException iex) {
			System.out.println("MAIN: Exception in main thread: "+ iex.getMessage());
		}
		
		System.out.println("ThreadSender:");
		
		ThreadSender snd = new ThreadSender();
		ThreadedSend s1 = new ThreadedSend("hi", snd); 	
		ThreadedSend s2 = new ThreadedSend("bye", snd);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		} catch (Exception e) {
			System.out.println("Send Thread interrupted");
		}
		
	}
}
