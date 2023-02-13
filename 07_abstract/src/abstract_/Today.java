package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date(); //시스템의 시간과 날짜
		System.out.println("오늘 날짜 : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 hh:mm:ss");
		System.out.println("오늘 날짜 : "+sdf.format(date));
		System.out.println();
		
		//입력 - 내생일
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMdd");
		Date birth = input.parse("19941217"); //String -> Date형 변환
		System.out.println("내 생일 : "+birth);
		System.out.println("내 생일 : "+sdf.format(birth));
		System.out.println();
		
//		Calendar cal = new Calendar(); //error : 추상클래스라 생성이 안됨
		//기준은 시스템 날짜와 시간
		Calendar cal = new GregorianCalendar();//Sub Class
		Calendar cal2 = Calendar.getInstance();//메소드
		
		
		int year = cal.get(Calendar.YEAR); // =int year = cal.get(1);
		int month = cal.get(Calendar.MONTH)+1; //1월 : 0, 2월 : 1 //int month = cal.get(2)+1;
		int day = cal.get(cal.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK); //일요일 : 1, 월요일 : 2
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "일"; break;
		case 2 : dayOfWeek = "월"; break;
		case 3 : dayOfWeek = "화"; break;
		case 4 : dayOfWeek = "수"; break;
		case 5 : dayOfWeek = "목"; break;
		case 6 : dayOfWeek = "금"; break;
		case 7 : dayOfWeek = "토"; break;
		}
		
		int hour = cal.get(cal.HOUR);
		int minute = cal.get(cal.MINUTE); 
		int second = cal.get(cal.SECOND); 
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+dayOfWeek+"요일 "+hour+"시 "+minute+"분 "+second+"초");

	}

}
