package class__;

import java.util.Scanner;

public class Exam_Test {
	private String name = null;
    private String dap = null;
    private char[] ox;
    private int score = 0;
    private final String JUNG = "11111"; //���ȭ
    
    //������
    public Exam_Test(){
    	Scanner scan = new Scanner(System.in);
    	System.out.print("�̸� �Է� : ");
        this.name = scan.next();
        System.out.print("�� �Է� : ");
        this.dap = scan.next();
        
        this.ox = new char[5];
    }
    
    public void compare() {
    	for(int i = 0 ; i < ox.length; i++){ //�迭�� ����
//    						JUNG.length(); //���ڿ��� ����
            if (dap.charAt(i)==JUNG.charAt(i)){ //charAt() : ������ �ε����� �ִ� ���ڸ� ��ȯ�Ѵ�.
                ox[i] = 'O';
                score = score +20;
            }
            else
            {
            	ox[i]='X';
            }
        }//for
    }
    
    public String getName(){
        return name;
    }
    
    public char[] getOX(){
        return ox;
    }
    
    public int getScore(){
        return score;
    }
    
}
