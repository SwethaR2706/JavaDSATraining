package Training;

import java.util.Scanner;

public class GradingSystemSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks=sc.nextInt();
		int grade=marks/10;
		switch(grade) {
		case 10:
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
			break;
		case 5:
			System.out.println("Grade E");
			break;
		case 4:
		case 3:
		case 2:
		case 1:
			System.out.println("Failed");
		default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
