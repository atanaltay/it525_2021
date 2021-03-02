package threadsynchexample2;



public class CounterMain {

	
	public static void main(String[] args) {
		
		CountService cntSrv = new CountService(100);
		
		ServiceThread t1 = new ServiceThread("t1", cntSrv);
		ServiceThread t2 = new ServiceThread("t2", cntSrv);
		
		t1.start();
		t2.start();
		
		
		
	}
	
	static class ServiceThread extends Thread{
		
		private CountService srv;
		private String name;
		
		public ServiceThread(String name, CountService srv) {
			this.name = name;
			this.srv = srv;
		}
		
		@Override
		public void run() {
			
			srv.countNumbers(name);
			
			
			
		}
	}
	
	
	
	
	
}
