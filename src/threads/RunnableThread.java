package threads;

public class RunnableThread implements Runnable {
	public static int myCount = 0;
	public RunnableThread() {}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 while(RunnableThread.myCount <= 10){
	            try{
	                System.out.println("RUNNABLE: Expl Thread: "+(++RunnableThread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("RUNNABLE: Exception in thread: "+iex.getMessage());
	            }
	        }
	}
}
