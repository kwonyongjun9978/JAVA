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
		//Calendar : �߻� Ŭ����
		Calendar cal = Calendar.getInstance(); //�޼ҵ带 �̿��Ͽ� Ŭ���� ����
		
		//������ �� ������ �ý��� ��¥�� ���� ���ϴ� ��¥�� ����
		cal.set(Calendar.YEAR, this.year); //�Է¹��� �⵵�� ����
		cal.set(Calendar.MONTH, this.month-1); //�Է¹��� ���� ����, month�� 0�� 1���̹Ƿ� -1�� ���ش�
		cal.set(Calendar.DAY_OF_MONTH, 1); //�Է¹��� ���� 1�Ϸ� ����
		
		//�ѹ��� ����
		//cal.set(year,month-1,1); 
		
		this.dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1���� ���� ���ϱ�, �ش� ��¥�� ����(1:�Ͽ��� �� 7:�����)
		this.end = cal.getActualMaximum(Calendar.DATE); //�ش� �� ������ ��¥
	}
	
	public void display() {
		System.out.println("---------["+this.year+"�� "+this.month+"��]---------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
