public class car {
	int year;
	String maker;
	double speed;

	public car(int year, String maker, double speed){
		this.year = year;
		this.maker = maker;
		this.speed = speed; 
	}
	
	public int getYear() {
		this.year = year; 
		return year;
	}
	
	public String getMake() {
		this.maker = maker; 
		return maker;
	}
	
	public double getSpeed() {
		this.speed = speed; 
		return speed;
	}
	
	public void printInfo() {
		System.out.println("/////////////////////////////////////////////////////");
		System.out.println("//  year : "+year+" // maker : "+maker+" // speed :"+speed+"  //");
		System.out.println("/////////////////////////////////////////////////////");
		if (speed > 85.0) {
			System.out.println("속도초과"); }
	}
}