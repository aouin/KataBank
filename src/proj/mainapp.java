package proj;

public class mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account A = new Account();
		
		A.deposit(5000);
		A.withdrawal(20);
		A.withdrawal(9000);
		A.deposit(5000);
		A.withdrawal(9000);
		A.history();
	}

}
