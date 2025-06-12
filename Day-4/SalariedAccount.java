package Training;

public class SalariedAccount extends Account {
	final double MIN_BAL=0.0;
	public SalariedAccount(String name,String pan,String mobNum,long aadhar,String type,double bal,double total) {
		super(name,pan,mobNum,aadhar,type,bal,total);
	}
	@Override
	public double withDraw(double amount) {
		if(totalBal>MIN_BAL)
			totalBal-=amount;
		else
			System.out.println("Insfficient Balance....");
		return totalBal;
		
	}
}
