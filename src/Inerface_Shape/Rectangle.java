package Inerface_Shape;

public class Rectangle implements Shape {
	int length1;
	int length2;
	
	public Rectangle(int length1,int length2) {
		this.length1= length1;
		this.length2= length2;
	}
	
	public void getArea() {
		int size = length1*length2;
		System.out.println("사각형의 넓이"+size);
	}
}
