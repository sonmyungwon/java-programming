package Shepe;

public class Circle extends Shape {
	int radius;
	public Circle(int radius) {
		this.radius= radius;
		
	}
	
	public void getArea() {
		double size = radius*radius*3.14;
		System.out.println("¿øÀÇ ³ĞÀÌ"+size);

	}

}
