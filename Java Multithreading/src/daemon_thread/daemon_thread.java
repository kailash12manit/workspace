package daemon_thread;

public class daemon_thread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().isDaemon()){
			System.out.println("daemon thread work");
		}
		else
		{
			System.out.println("user thread work");
		}
	}
	
	public static void main(String[] args) {
		
		daemon_thread  d1 = new daemon_thread();
		daemon_thread  d2 = new daemon_thread();
		daemon_thread  d3 = new daemon_thread();
		
		d1.setDaemon(true);
		d3.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
		//d3.setDaemon(true); //If you want to make a user thread as Daemon, it must not be
							//started otherwise it will throw IllegalThreadStateException.  
		
		
	}
	
	
}
