import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class File {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		String sentence;
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			
			FileOutputStream file = new FileOutputStream("text.txt");
			while (true) {
				sentence = input.nextLine(); 
				if (sentence.equals("End")) 
					break;
				
				file.write(format.format(date).getBytes());
				file.write("\t".getBytes());
				file.write(sentence.getBytes());
				file.write("\n".getBytes()); 
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}


