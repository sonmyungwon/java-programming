import java.util.Scanner;

public class calculator_assignment {
	public static void main(String args[]) {
	System.out.print("Please enter a number1:");
	Scanner number1= new Scanner(System.in);
	int num1 = number1.nextInt();
	System.out.print("Please enter a number2:");
	Scanner number2= new Scanner(System.in);
	int num2 = number2.nextInt();
	System.out.print("Please enter Operator:");
	Scanner Operator= new Scanner(System.in);
	String Oper = Operator.nextLine();
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