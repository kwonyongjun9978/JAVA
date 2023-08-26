package switch_;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days;
		
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		
		switch(month) { //실수형 타입은 쓸 수 없다
		case 2 : days=28; break;
		case 1 : days=31; 
		case 3 : days=31; 
		case 5 : days=31; 
		case 7 : days=31; 
		case 8 : days=31; 
		case 10 : days=31; 
		case 12 : days=31; break; //switch를 벗어나라
		case 4 : days=30; 
		case 6 : days=30; 
		case 9 : days=30;
		case 11 : days=30; break;
		default : days=0; //days 를 초기화를 안시켰기 때문에(garbage값 방지)
		}
		
		System.out.println(month + "월은" + days + "일 입니다");
		
		
	}

}