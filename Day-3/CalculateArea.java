package Training;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea ca=new CalculateArea();
		ca.calculateArea(4,5);
	}
	public void calculateArea(int len,int breadth) {
			int area =2*(len+breadth);
			System.out.println("Area="+area);
	}

}
