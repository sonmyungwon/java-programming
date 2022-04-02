package point;

public class sample {
	public static void main (String[] args) {
		point[] points = new point[5];
		for(int i =0; i<points.length; i++) {
			points[0] =new point(3,5,"red");
			
		}
		for(int i =0; i<points.length; i++) {
			points[i].println();
			
		}
		
	}
}
