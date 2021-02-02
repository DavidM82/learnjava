package threads;

public class ThreadedSend extends Thread {

	private String msg;
	private Thread t;
	ThreadSender send;
	ThreadedSend(String m, ThreadSender obj){
		this.msg = m;
		this.send = obj;
	}
	
	public void run() {
		synchronized(send) {
			send.send(msg);
		}
	}
}
