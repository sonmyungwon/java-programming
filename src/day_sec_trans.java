import java.util.Scanner;

public class day_sec_trans {
	public static void main(String args[]) {
		int time = 100000;
		int day=0;
		int hour=0;
		int min=0;
		int sec=0;
		if(time>60*60*12) {
			day= time/(60*60*24);
			time=time%(60*60*24);
			System.out.println(time);
			if (time>60*60) {
				hour = time/(60*60);
				time=time%(60*60);
				System.out.println(time);
				}
				if (time>60) {
					min = time/(60);
					time=time%60;
					System.out.println(time);
					}
					else {
						sec = time;
						System.out.println(time);
						}
		if(day<365) {
			System.out.print("일년이하입니다.");
		}
		System.out.print(day +"day  ");
		System.out.print(hour+"hour  ");
		System.out.print(min+"min  ");
		System.out.println(sec+"sec");
		}
	}
}
