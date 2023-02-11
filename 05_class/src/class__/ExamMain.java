package class__;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     System.out.print("인원수 입력: ");
	     int num = scan.nextInt();
//	         scan.nextLine();
	      // 클래스 가 들어갈 널 배열생성(객체배열)
	      Exam[] exams = new Exam[num];
	        
	        for (int i = 0 ; i < num; i++){
	            System.out.print("이름 입력 : ");
	            String name = scan.next();
	            System.out.print("답 입력 : ");
	            String dap = scan.next();
	            // for 문으로 배열에다 new 넣어줌
	            char[] ox = {'X','X','X','X','X'};
	            exams[i] = new Exam(name,dap,ox,0);
	        }

	        System.out.println("이름\t12345\t점수");
	        for (int i =0 ; i <num; i ++){
	            exams[i].compare();
	            
	            // char[] 형을 string 형변환
	            String ar = new String((exams[i].getOX()));

	            System.out.print(exams[i].getName()+"\t"+ar+"\t"+exams[i].getScore());
	            System.out.println();
	        }
		

	}

}

/*
[문제] 사지선다형
- 총 5문제의 답을 입력받는다
- 정답은 "11111" 이다
- 맞으면 'O', 틀리면 'X'
- 1문제당 점수는 20점씩 처리

클래스명 : Exam
* 필드
private String name = null;
private String dap = null;
private char[] ox = null;
private int score = 0;
private final String JUNG = "11111"; //상수화

* 메소드
생성자 - Scanner 를 이용하여 이름과 답을 입력받는다. 
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
인원수 입력 : 2

이름 입력 : 홍길동
답 입력 : 12311  

이름 입력 : 코난
답 입력 : 24331

이름      1 2 3 4 5   점수
홍길동     O X X O O   60
코난     X X X X O   20
*/
