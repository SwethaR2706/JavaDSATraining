package Training;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1=sc.nextDouble();
		System.out.println("Enter second number: ");
		double num2=sc.nextDouble();
		System.out.println("Enter operator(+,-*,/)");
		char op=sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("Result = "+(num1+num2));
			break;
		case '-':
			System.out.println("Result = "+(num1-num2));
			break;
		case '*':
			System.out.println("Result = "+(num1*num2));
			break;
		case '/':
			if(num2!=0)
				System.out.println("Result = "+(num1/num2));
			else
				System.out.println("Cannot divide by zero");
			break;
		default:
			System.out.println("Invalid operator");
			
		}
		sc.close();
	}

}
