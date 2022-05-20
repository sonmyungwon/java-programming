package Exception;

import java.util.Scanner;

public class OddExceptionTest {
	public static void main(String[] args) {
		try {
			int number = readnum(); 
		}
		catch(MyException e) {
			System.out.println("Please enter an even number!!");
		} 
	}
	public static int readnum() throws MyException{ 
		Scanner input = new Scanner(System.in); 
		int num = input.nextInt();
		if (num %2 == 1){
			throw new MyException(num); 
		}
		return num; 
	}
}
