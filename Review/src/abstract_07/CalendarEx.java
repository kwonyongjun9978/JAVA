package abstract_07;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

	Scanner sc = new Scanner(System.in);
	private int year;
	private int month;
	private int end;
	private int dayOfWeek;
	
	public CalendarEx() {
		System.out.print("�⵵ �Է� : ");
		this.year = sc.nextInt();
		System.out.print("�� �Է� : ");
		this.month = sc.nextInt();
	}
	
	public void calc() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, this.year);
		cal.set(Calendar.MONTH, this.month-1);
		//cal.set(Calendar.DAY_OF_MONTH, 1);
		
		this.dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		this.end = cal.getActualMaximum(Calendar.DATE);
	}
	
	public void display() {
		//System.out.println(dayOfWeek);
		//System.out.println(end);
		System.out.println("---------["+this.year+"�� "+this.month+"��]---------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1; i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=end; i++) {
			System.out.print(i+"\t");
			
			if(dayOfWeek%7==0) System.out.println();
			dayOfWeek++;
		}
	}

}
