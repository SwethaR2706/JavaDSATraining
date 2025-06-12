package Training;

public abstract class Account {
	String name;
	String panCardnum;
	String mobNum;
	long aadharNum;
	String accType;
	double minBal;
	double totalBal;
	
	public Account(String name,String pan,String mobNum,long aadhar,String type,double bal,double totalBal) {
		this.name=name;
		this.panCardnum=pan;
		this.mobNum=mobNum;
		this.aadharNum=aadhar;
		this.accType=type;
		this.minBal=bal;
		this.totalBal=totalBal;
	}
	public abstract double withDraw(double amount);
	public double deposit(double amount) {
		return totalBal+=amount;
	}
}
