import java.util.Scanner;

public class converter {
	public static void main(String args[]) {
		System.out.print("input F-Temperature:");
		Scanner first= new Scanner(System.in);
		double FTemp = first.nextDouble();
		System.out.print("input C-Temperature:");
		Scanner second= new Scanner(System.in);
		double CTemp = second.nextDouble();
		
		double convertF_C =(5*(FTemp-32))/9 ;
		double convertC_F =((9*CTemp)/5)+32 ;
		
		System.out.print("result F-Temperature->C-Temperature:   ");
		System.out.print(FTemp);
		System.out.print("->");
		System.out.println(convertF_C);
		System.out.print("result C-Temperature->F-Temperature:   ");
		System.out.print(CTemp);
		System.out.print("->");
		System.out.println(convertC_F);
		
	}
}
