import java.util.Scanner;

public class calculator_assignment {
	public static void main(String args[]) {
	System.out.print("Please enter a number1:");
	Scanner input= new Scanner(System.in);
	int num1 = input.nextInt();
	System.out.print("Please enter a number2:");
	int num2 = input.nextInt();
	System.out.print("Please enter Operator:");
	String Oper = input.next();
	int ans =0;
	switch(Oper){
		case "*" : ans =num1*num2;
		System.out.println("The calculation result is   "+ ans);
		break;
		
		case "/" :ans =num1/num2;
		System.out.println("The calculation result is   "+ ans);
		break;
		
		case "-" : ans =num1-num2;
		System.out.println("The calculation result is   "+ ans);
		break;
		
		case "+" : ans =num1+num2;
		System.out.println("The calculation result is   "+ ans);
		break;
		}	
	}
}