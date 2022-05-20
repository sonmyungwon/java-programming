package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
			int num1,num2;
			num1 = input.nextInt(); 
			num2 = input.nextInt(); 
			int result = num1 + num2;
			System.out.println(result);
		}
		catch(InputMismatchException e){
			System.out.println("InputMismatchException");
		}
	}
}

