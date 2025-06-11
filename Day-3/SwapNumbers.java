package Training;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbers sn=new SwapNumbers();
		sn.swapNumbers(5, 10);
	}
	void swapNumbers(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
