package Training;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating car object");
		Car c1=new Car("F2",2020);
		System.out.println("Car Details...");
		c1.getDetails();
		Car c2=new Car("BMW",2022);
		c2.getDetails();
	}

}
class Car{
	int make;
	String brand,model;
	/*Car(){
		make=2020;
		brand="Ambassador";  
		model=null;
	}*/
	Car(String model,int make){
		this.model=model;
		this.make=make;
	}
	void getDetails() {
		System.out.println("My car details are....");
		
	}
}