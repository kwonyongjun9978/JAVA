package class__;

public class Exam {
	private String name = null;
    private String dap = null;
    private char[] ox = null;
    private int score = 0;
    private final String JUNG = "11111"; //���ȭ
    
    // ������
    public Exam(String name, String dap,char[] ox,int score){
        this.name = name;
        this.dap = dap;
        this.ox = ox;
        this.score =score;
    }

    public void compare(){
        for(int i = 0 ; i < 5; i++){
            // �����̸� o �� �ٲ��ְ� 20�� �÷���
            if (dap.charAt(i)==JUNG.charAt(i)){
                ox[i] = 'O';
                score = score +20;
            }
        }
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


