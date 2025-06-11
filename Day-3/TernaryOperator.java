package Training;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=20;
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		String op=(n%2==0)?"Even":"Odd";
		System.out.println(op);*/
		TernaryOperator to=new TernaryOperator();
		to.posNeg(0);
	}
	void posNeg(int num) {
		String op= (num>=0)? "Positive":"Negative";
		System.out.println(op);
	}
	

}
