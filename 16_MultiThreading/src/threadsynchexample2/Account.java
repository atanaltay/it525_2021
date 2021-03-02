package threadsynchexample2;

public class Account {
	
	
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public synchronized void withdrawMoney(double amount) {
		
		if(amount<=balance) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			balance-=amount;
			System.out.println("Money withdrawn");
			
			
		}else {
			System.out.println("Not enough balance!!!");
		}
		
		
		System.out.println("Balance:" + balance);
		
		
		
	}
	
	

}
