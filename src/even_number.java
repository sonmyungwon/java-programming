import java.util.Scanner;

public class even_number {
	public static void main(String[] args) {
		System.out.print("input:");
		Scanner input = new Scanner(System.in);
		int  x= input.nextInt();
		if(x%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}
}