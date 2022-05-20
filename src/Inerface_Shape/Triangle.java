package Inerface_Shape;

public class Triangle implements Shape {
	int length;
	int height;
	public Triangle(int length, int height) {
		this.height =height;
		this.length = length;
	}
	public void getArea() {
		int size= length*height/2;
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ:"+ size);
	}
}
