package executorexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		ExecutorService srv = Executors.newCachedThreadPool();

		srv.execute(new CountThread());
		srv.execute(new CountThread());
		
		
		srv.shutdown();
		
		
		
		
	}
	
	static class CountThread implements Runnable{
		
		
		@Override
		public void run() {
			int count = 0;
			
			while(count<=100) {
				
				count++;
				try {
					Thread.sleep(50);
					System.out.println(count);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			
		}
		
		
	}
	
	
	
}
