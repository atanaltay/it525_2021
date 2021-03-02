package threadsynchexample2;

public class CountService {

	
	private int max;
	
	
	public CountService(int max) {
		this.max = max;
	}
	
	//Locking with synchronized keyword
	/*
	public synchronized void countNumbers(String threadName) {
		
		
		for (int i = 0; i < max; i++) {
			System.out.println(threadName +  "--" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	*/
	
	//Locking with synchronized block
	public  void countNumbers(String threadName) {
		
		
		synchronized (this) {

			for (int i = 0; i < max; i++) {
				System.out.println(threadName +  "--" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
}
