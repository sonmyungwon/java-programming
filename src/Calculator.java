import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		System.out.print("input num1:");
		Scanner first= new Scanner(System.in);
		int fnum = first.nextInt();
		System.out.print("input num2:");
		Scanner seccond= new Scanner(System.in);
		double snum = seccond.nextDouble();
		
		double Plus = fnum + snum ;
		double Minus = fnum - snum;
		double Multiplication= fnum * snum;
		double Divisione =fnum/snum;
		double Remainder= fnum % snum ;
		System.out.print("result plus:");
		System.out.println(Plus);
		System.out.print("result Minus:");
		System.out.println(Minus);
		System.out.print("result Multiplication:");
		System.out.println(Multiplication);
		System.out.print("result Divisione:");
		System.out.println(Divisione);
		System.out.print("result Remainder:");
		System.out.println(Remainder);
	}
}
