package example1;

public class MainClass2 {

	public static void main(String[] args) {
		
		
		
		CountRunnable cntRunnable = new CountRunnable();
		
		Thread cnt1 = new Thread(cntRunnable);
		//cnt1.setDaemon(true);
		cnt1.start();
		
		
		Thread cnt2 = new Thread(()->{
			
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		});
		
		cnt2.start();
	}
	
	static class CountRunnable implements Runnable{
		
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
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
