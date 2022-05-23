import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class File1 {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		String text;
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {

			FileOutputStream file = new FileOutputStream("text.txt");
			while (true) {
				text = input.nextLine(); 
				if (text.equals("End")) 
					break;

				file.write(format.format(date).getBytes());
				file.write("\t".getBytes());
				file.write(text.getBytes());
				file.write("\n".getBytes()); 
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
