package Shepe;

public class Tester {

	public static void main(String[] args) {
		Shape shape[] = new Shape[3];
		shape[0] = new Triangle(3,4);
		shape[1] = new Rectangle(4,4);
		shape[2] = new Circle(5);
		for (int i = 0; i<=2; i++) { shape[i].getArea();
		}
	}

}
