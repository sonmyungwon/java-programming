package Inerface_Shape;

public class Circle implements Shape {
	int radius;
	public Circle(int radius) {
		this.radius= radius;
	}
	
	public void getArea() {
		double size = radius*radius*3.14;
		System.out.println("���� ����"+size);
	}
}
