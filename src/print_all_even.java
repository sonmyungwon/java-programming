import java.util.Scanner;

public class print_all_even {
	public static void main(String[] args) {
		System.out.print("input:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.print("{");
		for(int i=0;i<a;i++) {
			if(i%2==1) {
			System.out.print(i+",");
			}
		}
		System.out.println("}");
	}
}
