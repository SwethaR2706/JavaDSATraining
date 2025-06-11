package Training;

import java.util.Scanner;

public class SemsterPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("1st year Semester 1");
			break;
		case 2:
			System.out.println("1st year Semester 2");
			break;
		case 3:
			System.out.println("2nd year Semester 1");
			break;
		case 4:
			System.out.println("2nd year Semester 2");
			break;
		case 5:
			System.out.println("3rd year Semester 1");
			break;
		case 6:
			System.out.println("3rd year Semester 2");
			break;
		case 7:
			System.out.println("4th year Semester 1");
			break;
		case 8:
			System.out.println("4th year Semester 2");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
