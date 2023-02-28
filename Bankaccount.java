package feb28;
interface BankaccountInterface { // Parent Interface
	void deposit(); // Create  method
	 void withdraw();
}
class CheckingAccount implements BankaccountInterface { // Child Class
	@Override
	public void deposit() { // Create method
		int deposit=10000;
		System.out.println("Cash deposite :" + deposit);
	}
	@Override
	public void withdraw() { // Create method
		int withdraw=3000;
		System.out.println("Cash withdraw :" + withdraw);
	}}
public class Bankaccount { // main class
	public static void main(String[] args) { // main method
		CheckingAccount obj=new CheckingAccount(); // creating object
		obj.deposit();
		obj.withdraw();
	}}
			
		