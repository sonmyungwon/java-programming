
import java.util.*;

class UpDownGame {
    //�Ʒ��� number, count ������ �����غ�����.
    private int number;
    static int count;
    
    private static UpDownGame udg = new UpDownGame();
    private static UpDownGame instance;
    //�Ʒ��� UpDownGame�� �����ڸ� �����ϼ���.
    public static UpDownGame getInstance(){
        if(instance == null)    
            instance =udg;
            return instance;
    }
    
    
    //�Ʒ��� getInstance() �޼ҵ带 �����ϼ���.
    
    
    
    //1���� 100������ ������ ������ ��ȯ�ϴ� �Լ�
    private static int getRandomInt() {
        int randInt = (int)(Math.random() * 100) + 1; 
        return randInt;
    }
    
    public static boolean ask(int n) {
    count++;
    System.out.println("���� ����Ƚ�� : " + count + "��, " + "����");
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
            n = s.nextInt();        //������ �Է¹޽��ϴ�.
            flag = myGame.ask(n);
        }
	}
}
