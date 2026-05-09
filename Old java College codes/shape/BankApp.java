import java.util.Scanner;
class LowbalanceExpection extends Exception{
	public LowbalanceExpection(String ms){
	
	super(ms);
	}
}

class NegativenumberExpection extends Exception{
	public NegativenumberExpection(String ms){
	super(ms);
	}
}

class Bankaccount{
	private double balance;

	public Bankaccount(double initialbalance){
		this.balance=initialbalance;
	}

	public void Checkbalance(){
		System.out.println("current balance :"+ balance);
	}

	public void deposit(double damount) throws NegativenumberExpection {
		if(damount < 0){
			throw new NegativenumberExpection("amount can not be negative.");
		}
		balance += damount;
		System.out.println("RS "+damount+" Deposited successfully.");

	}

	public void Withdraw(double amount)throws NegativenumberExpection ,LowbalanceExpection {
	if(amount < 0){
			throw new NegativenumberExpection("amount can not be a negative.");
		}
		if(balance < amount){
			throw new LowbalanceExpection("Insuffcient balance.");
		}
		balance -=amount;
		System.out.println("RS "+amount+" withdrawed successfully."); 
	}

}
class BankApp{
	public static void main(String[] args) {

		Bankaccount ac = new Bankaccount(1000);
		Scanner sc = new Scanner(System.in);

		try{

		ac.Checkbalance();

		System.out.println("enter amount to deposit: " );
		double damount=sc.nextInt();
ac.deposit(damount);
System.out.println("enter amount to withdraw: " );
		double amount=sc.nextInt();

		ac.Withdraw(amount);
		ac.Checkbalance();
		}
		catch (LowbalanceExpection | NegativenumberExpection e){
			System.out.println("Exception:" + e.getMessage());

		}
		
		ac.Checkbalance();
		
	}
}