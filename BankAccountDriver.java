package PricipleOfOop;

public class BankAccountDriver {
	
	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("Aniket","ICICI",123456l,1234,"ICICh4");
		
		System.out.println(b1.getBalance(123456l,1234));
		b1.credit(123456l,1234, 19000);
		b1.debit(123456l, 1234,100);
		
		b1.getUserName();
	}	
}
