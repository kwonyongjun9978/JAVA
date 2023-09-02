package class_05;

import java.util.Scanner;

public class Exam {
	private String name = null;
    private String dap = null;
    private char[] ox;
    private int score = 0;
    private final String JUNG = "11111"; //상수화
    
    public Exam() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("이름 입력 : ");
    	this.name = sc.next();
    	System.out.print("답 입력 : ");
    	this.dap = sc.next();
    	
    	this.ox = new char[5];
    }
    
    public void compare() {
    	for(int i=0; i<ox.length; i++) {
    		
    		if(dap.charAt(i)==JUNG.charAt(i)) {
    			ox[i] = 'O';
    			score += 20;
    		}else {
    			ox[i] = 'X';
    		}
    	}
    }
    
    public String getName() {
    	return name;
    }
    
    public char[] getOx() {
    	return ox;
    }
    
    public int getScore() {
    	return score;
    }
}
