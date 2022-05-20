package Inerface_Shape;

public class Tester {

	public static void main(String[] args) {
		Shape shape[] = new Shape[3];
		shape[0] = new Triangle(4,7);
		shape[1] = new Rectangle(5,6);
		shape[2] = new Circle(8);
		for (int i = 0; i<=2; i++) { shape[i].getArea();
		}
	}
}