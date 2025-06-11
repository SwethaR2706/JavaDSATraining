package Training;

public class Vehicle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.riding();
		b.driving();
	}

}
class AutoMobile{
	void riding() {
		System.out.println("Someone's riding vehicle");
	}
}

class Bike extends AutoMobile{
	void driving() {
		System.out.println("Driving the Car");
	}
}