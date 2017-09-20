package proj;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Transaction {

	private Date date;
	private double value;
	private double balance;
	private String type;
	
	public Transaction(String type,double value, double balance) {
		super();
		
		this.date = new Date();
		this.value = value;
		this.balance = balance;
		this.type = type;
	}

	public String print() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		return  dateFormat.format(date) +"		|"+ value +"		|"+ balance +"		|"+ type;
	}
	
}
