package class__;

public class Exam {
	private String name = null;
    private String dap = null;
    private char[] ox = null;
    private int score = 0;
    private final String JUNG = "11111"; //상수화
    
    // 생성자
    public Exam(String name, String dap,char[] ox,int score){
        this.name = name;
        this.dap = dap;
        this.ox = ox;
        this.score =score;
    }

    public void compare(){
        for(int i = 0 ; i < 5; i++){
            // 정답이면 o 로 바꿔주고 20점 플러스
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


