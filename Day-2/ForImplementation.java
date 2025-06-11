package Training;

public class ForImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println("Number:"+i);
			if(i==5) {
				break;
			}
			System.out.println("Number:"+i);
		}
	}

}
