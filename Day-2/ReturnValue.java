package Training;

public class ReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=add(5,6);
		System.out.println(sum);
		System.out.println("Add returns:"+add(5,6));
		add_void(5,6);
		//System.out.println("Results:"+add_void(5,6));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static void add_void(int a,int b) {
		int sum=a+b;
		System.out.println("Sum="+sum);
	}
	public void add_void_Obj(int a,int b) {
		int sum=a+b;
		System.out.println("Sum="+sum);
	}

}
