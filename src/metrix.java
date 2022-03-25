
public class metrix {
	public static void main(String args[]) {
		int[][] met1 ={{1,0,2},{-1,3,1}};
		int[][] met2 ={{3,1},{2,1},{1,0}};
		int[][] result =new int[met1.length][met2[0].length];
		for(int i=0;i<met1.length;i++) {
			for(int j=0; j<met2[0].length; j++) {
				for(int k=0; k<met1[0].length; k++) {
					result[i][j]+= met1[i][k]*met2[k][j];
				}
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.print("{ ");
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.print(" }");
			System.out.println();
		}
	}}





