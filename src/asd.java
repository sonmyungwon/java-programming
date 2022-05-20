
import java.util.*;

class UpDownGame {
    //아래에 number, count 변수를 선언해보세요.
    private int number;
    static int count;
    
    private static UpDownGame udg = new UpDownGame();
    private static UpDownGame instance;
    //아래에 UpDownGame의 생성자를 구현하세요.
    public static UpDownGame getInstance(){
        if(instance == null)    
            instance =udg;
            return instance;
    }
    
    
    //아래에 getInstance() 메소드를 구현하세요.
    
    
    
    //1부터 100까지의 무작위 정수를 반환하는 함수
    private static int getRandomInt() {
        int randInt = (int)(Math.random() * 100) + 1; 
        return randInt;
    }
    
    public static boolean ask(int n) {
    count++;
    System.out.println("현재 도전횟수 : " + count + "번, " + "정답");
        return false;
    }
}


public class Main {
	public static void main(String args[]) {
        boolean flag = false;
        Scanner s = new Scanner(System.in);
        int n = 0;
        
        UpDownGame myGame = UpDownGame.getInstance();
        
        while(!flag) {
            n = s.nextInt();        //정수를 입력받습니다.
            flag = myGame.ask(n);
        }
	}
}
