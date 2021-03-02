package example1;

public class MainClass {

	
	public static void main(String[] args) {
		

		CountThread t1 = new CountThread("t1");
		t1.start();
		
		CountThread t2 = new CountThread("t2");
		t2.start();
		
		
		
		
	}
	
	//Legacy Thread, extending from Thread type
	static class CountThread extends Thread{
		
		String name;
		
		public CountThread(String name) {
			this.name = name;
		}
	
		@Override
		public void run() {
			int count = 0;
			
			while(count<=100) {
				System.out.println("Thread " + name + "--- " + count);
				count++;
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
