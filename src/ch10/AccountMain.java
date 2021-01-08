package ch10;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.deposit(10000);
		System.out.println("예금액 : "+acc.getBalance());
		
		try {
			acc.withDraw(30000);
		}
		catch(BalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
		
		
		
	}

}
