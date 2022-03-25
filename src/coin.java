import java.util.Scanner;

public class coin {
	public static void main(String[] args) {
		int num = (int)(Math.random()*2);
		System.out.print("H or T: ");
		Scanner input = new Scanner(System.in); 
		String rnadcoin = input.next();
		if (rnadcoin.equals("H")) { 
			if (num == 0) {
				System.out.println("Correct!"); 
			} else {
				System.out.println("Incorrect!");
			}
		} 
		else {
			if (num == 1) {
				System.out.println("Correct!"); }
			else {
				System.out.println("Incorrect!"); }
		}
	}
}

