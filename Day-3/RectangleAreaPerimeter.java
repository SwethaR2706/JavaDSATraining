package Training;

public class RectangleAreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleAreaPerimeter rp=new RectangleAreaPerimeter();
		rp.calculateArea(10, 9);
		rp.calculatePerimeter(10,9);
		
	}
	public void calculateArea(int len,int breadth) {
		int area=len*breadth;
		System.out.println("Area: "+area);
	}
	public void calculatePerimeter(int len,int breadth) {
		int perimeter=2*(len+breadth);
		System.out.println("Perimeter: "+perimeter);
	}

}
