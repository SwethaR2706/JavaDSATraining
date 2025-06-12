package Training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		m.selectAccount();
		m.createAccounts();
		m.withDraw();
				
		}
	public void selectAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select an option");
		System.out.println("1.Create Account");
		System.out.println("2.Withdraw");
		System.out.println("3.Exit");
		int option=sc.nextInt();
		switch(option){
			case 1:
				createAccounts();
				break;
			case 2:
				withDraw();
				break;
			case 3:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Input");
		}
		sc.close();

	}
	public void createAccounts() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your Name: ");
		sc1.nextLine();
		System.out.println("Enter your PAN Number: ");
		sc1.nextLine();
		System.out.println("Enter your Mobile Number: ");
		sc1.nextLine();
		System.out.println("Enter your Aadhar Number: ");
		sc1.nextLong();
		System.out.println("Enter Account Type: ");
		String type=sc1.nextLine();
		switch(type) {
		case "Savings":
			System.out.println("Savings Account Created");
			break;
		case "Current":
			System.out.println("Current Account Created");
			break;
		case "Salaried":
			System.out.println("Salaried Account Created");
			break;
		default:
			System.out.println("Invalid Input");
		}
		sc1.close();
	}
	public double withDraw() {
		double totalBal = 0;
		final double MIN_BAL = 0;
		double amount = 0;
		if(totalBal>MIN_BAL)
			totalBal-=amount;
		else
			System.out.println("Insfficient Balance....");
		return totalBal;
	}
}
