import java.util.Scanner;


public class menuManagement {
	public static void main (String args[]) {
		int com = 0;
		Scanner input= new Scanner(System.in);
		while(com!=6){
		System.out.println("1. Add Schedule");
		System.out.println("2. Delate Schedule");
		System.out.println("3. Edit Schedule");
		System.out.println("4. View Schedule");
		System.out.println("5. show a menu");
		System.out.println("6. Exit");
		System.out.print("Please enter a number:");
		com = input.nextInt();
		switch(com) {
		case 1 : 		
			System.out.println("schedule name");		
			String schedule = input.next();

			System.out.println("2. Delate Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedule");
			System.out.println("5. Exit");
		}}
	}
	
}
