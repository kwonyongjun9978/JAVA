package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date(); //�ý����� �ð��� ��¥
		System.out.println("���� ��¥ : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y�� MM�� dd�� E���� hh:mm:ss");
		System.out.println("���� ��¥ : "+sdf.format(date));
		System.out.println();
		
		//�Է� - ������
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMdd");
		date = input.parse("19941217"); //String -> Date�� ��ȯ
		System.out.println("�� ���� : "+date);
		System.out.println("�� ���� : "+sdf.format(date));
		System.out.println();
		
//		Calendar cal = new Calendar(); //error : �߻�Ŭ������ ������ �ȵ�
		//������ �ý��� ��¥�� �ð�
		Calendar cal = new GregorianCalendar();//Sub Class�̿� => public class GregorianCalendar extends Calendar 
											   //Calendar �߻�Ŭ������ ��ӹ��� GregorianCalendar �ڽ� Ŭ������ java���� ���ǵ� Ŭ�������� ���� Calendar �߻�Ŭ������ �߻�޼ҵ� �������̵带 �� �ʿ����. 
											   //�̹� GregorianCalendar �ڽ� Ŭ������ Calendar �߻�Ŭ������ �߻�޼ҵ���� �������̵� �Ǿ� ����Ǿ��ִ�
		Calendar cal2 = Calendar.getInstance();//�޼ҵ��̿�
		
		
		int year = cal.get(Calendar.YEAR); // int year = cal.get(1);
		int month = cal.get(Calendar.MONTH)+1; //1�� : 0, 2�� : 1 /int month = cal.get(2)+/1;
		int day = cal.get(cal.DAY_OF_MONTH); //DATE
		int week = cal.get(cal.DAY_OF_WEEK); //�Ͽ��� : 1, ������ : 2
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "��"; break;
		case 2 : dayOfWeek = "��"; break;
		case 3 : dayOfWeek = "ȭ"; break;
		case 4 : dayOfWeek = "��"; break;
		case 5 : dayOfWeek = "��"; break;
		case 6 : dayOfWeek = "��"; break;
		case 7 : dayOfWeek = "��"; break;
		}
		
		int hour = cal.get(cal.HOUR);
		int minute = cal.get(cal.MINUTE); 
		int second = cal.get(cal.SECOND); 
		
		System.out.println(year+"�� "+month+"�� "+day+"�� "+dayOfWeek+"���� "+hour+"�� "+minute+"�� "+second+"��");

	}

}
