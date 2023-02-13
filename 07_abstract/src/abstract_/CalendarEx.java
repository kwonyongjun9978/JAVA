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
		System.out.print("�⵵ �Է� : ");
		this.year = sc.nextInt();
		System.out.print("�� �Է� : ");
		this.month = sc.nextInt();
	}
	public void calc() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, this.year); //�Է¹��� �⵵�� ����
		cal.set(Calendar.MONTH, this.month); //�Է¹��� ���� ����
		cal.set(year,month-1,1); //�Է¹��� ���� 1�Ϸ� ����
        						 //month�� 0�� 1���̹Ƿ� -1�� ���ش�
		this.end = cal.getActualMaximum(Calendar.DATE); //�ش� �� ������ ��¥
		this.dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //�ش� ��¥�� ����(1:�Ͽ��� �� 7:�����)
	}
	
	public void display() {
		System.out.println("---------["+this.year+"�� "+this.month+"��]---------");
		System.out.println("  ��   ��  ȭ   ��   ��   ��  ��");
		
		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if(i<10) { //���ڸ����� ��� ������ �߰��ؼ� �ٸ��߱�
				System.out.print(" ");
			}
			System.out.print(" "+i+" ");
			if(dayOfWeek%7==0) { //���ٿ� 7�Ͼ� ���
				System.out.println();
			}
			dayOfWeek++;
		}
	}
	
}
