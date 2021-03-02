package threadsynchexample2;

public class AccountMain {

	
	public static void main(String[] args) {
		
		Account account = new Account(1000);
		
		BankingThread husbandThread = new BankingThread(account, 800);
		BankingThread wifeThread = new BankingThread(account, 800);
		
		husbandThread.start();
		wifeThread.start();
		
		
	}
	
	
	static class BankingThread extends Thread{
		
		Account acc;
		double amount;

		
		public BankingThread(Account acc, double amount) {
			super();
			this.acc = acc;
			this.amount = amount;
		}

		@Override
		public void run() {
			
			acc.withdrawMoney(amount);
			
			
		}
		
		
		
	}
	
	
}
