package abstract_;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

	Scanner sc = new Scanner(System.in);
	private int year;
	private int month;
	private int end;
	private int dayOfWeek;
	
	public CalendarEx(){
		System.out.print("년도 입력 : ");
		this.year = sc.nextInt();
		System.out.print("월 입력 : ");
		this.month = sc.nextInt();
	}
	public void calc() {
		//Calendar : 추상 클래스
		Calendar cal = Calendar.getInstance(); //메소드를 이용하여 클래스 생성
		
		//생성할 때 기준인 시스템 날짜를 내가 원하는 날짜로 변경
		cal.set(Calendar.YEAR, this.year); //입력받은 년도로 세팅
		cal.set(Calendar.MONTH, this.month-1); //입력받은 월로 세팅, month는 0이 1월이므로 -1을 해준다
		cal.set(Calendar.DAY_OF_MONTH, 1); //입력받은 월의 1일로 세팅
		
		//한번에 세팅
		//cal.set(year,month-1,1); 
		
		this.dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1일인 요일 구하기, 해당 날짜의 요일(1:일요일 … 7:토요일)
		this.end = cal.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜
	}
	
	public void display() {
		System.out.println("---------["+this.year+"년 "+this.month+"월]---------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<dayOfWeek; i++) {
			System.out.print("\t");
		}//for i
		
		for(int i=1; i<end; i++) {
			System.out.print(i+"\t");
			
			if(dayOfWeek%7==0) System.out.println();
			dayOfWeek++;
			
		}//for i
		
	}
	
}
