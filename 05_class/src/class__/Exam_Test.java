package class__;

import java.util.Scanner;

public class Exam_Test {
	private String name = null;
    private String dap = null;
    private char[] ox;
    private int score = 0;
    private final String JUNG = "11111"; //상수화
    
    //생성자
    public Exam_Test(){
    	Scanner scan = new Scanner(System.in);
    	System.out.print("이름 입력 : ");
        this.name = scan.next();
        System.out.print("답 입력 : ");
        this.dap = scan.next();
        
        this.ox = new char[5];
    }
    
    public void compare() {
    	for(int i = 0 ; i < ox.length; i++){
//    						JUNG.length();
            if (dap.charAt(i)==JUNG.charAt(i)){
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
