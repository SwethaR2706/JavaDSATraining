package Training;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks: ");
		int user_input=sc.nextInt();
		if (user_input>=90 && user_input<=100)
			System.out.println("Grade A");
		else if(user_input>=80 && user_input<90)
			System.out.println("Grade B");
		else if(user_input>=70 && user_input<80)
			System.out.println("Grade C");
		else if(user_input>=60 && user_input<70)
			System.out.println("Grade D");
		else if(user_input>=50 && user_input<60)
			System.out.println("Grade E");
		else if(user_input<50 && user_input>=0)
			System.out.println("Failed");
		else
			System.out.println("Invalid input");
		sc.close();
	}

}
