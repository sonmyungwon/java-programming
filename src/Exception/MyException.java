package Exception;

public class MyException extends Exception {
	private int number;
	public MyException(int number) {
		this.number = number;
	}
}
