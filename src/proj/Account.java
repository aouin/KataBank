package proj;
import java.util.LinkedList;
import java.util.ListIterator;


public class Account {

	 private double balance;
	 private LinkedList<Transaction> transactions = new LinkedList<Transaction>();
	 
	 
	 public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account() {
		super();
		balance = 0;
	}

	//Deposit an amount in Account
	//Check if amount is unsigned
	public void deposit(double amount){
		 if (amount > 0) {
		 double upbalance = this.balance + amount;
		 this.balance = upbalance;
		 transactions.add(new Transaction("D",amount,upbalance));}
	 }
	
	//Withdrawal an amount in Account
	//Check if amount is unsigned
	//Check if balance > amount if false persist transaction with Failed label.
	
	 public void withdrawal(double amount){
		 if (amount > 0) {
		 double upbalance = this.balance - amount;
		 if (upbalance > 0)
			 {this.balance = upbalance;
			 transactions.add(new Transaction("W",amount,upbalance));}
		 else
			 {transactions.add(new Transaction("W(Failed)",amount,balance));}}
	 }
	 
	//Get the current Balance Before printing history of all transactions
	 public void history(){
		 System.out.println("Your current Balance is : " + this.balance);
		 System.out.println("------------------------------------------------------------------------");
		 System.out.println("Date               		|Amount		|Balance	|Transaction");
		 System.out.println("------------------------------------------------------------------------");
		 
		 ListIterator<Transaction> listIterator = this.transactions.listIterator();
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next().print());
			}
	 }
}
