import java.util.Scanner;

public class simulate_a_car {
	
	public static void main(String[] args) {
		car cars = new car(2015, "Honda", 85.0);
		Scanner input = new Scanner(System.in); 
		System.out.print("car's year : ");
		cars.year = input.nextInt();
		System.out.print("car's maker : "); 
		cars.maker = input.next();
		System.out.print("car's speed : "); 
		cars.speed = input.nextDouble();
		
		cars.printInfo();
		}
}
