package class__;

public class StringMain {

	public static void main(String[] args) {
		String a= "apple"; //literal 생성(but 모든 class는 new 생성자로 생성해야 한다)
		String b= "apple";
		if(a==b) { //주소
			System.out.println("a와 b의 참조값은 같다.");
		}
		else {
			System.out.println("a와 b의 참조값은 다르다.");
		}
		
		if(a.equals(b)) { //안에 들어있는 문자열
			System.out.println("a와 b의 문자열은 같다.");
		}
		else {
			System.out.println("a와 b의 문자열은 다르다.");
		}
		System.out.println();
		
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) { //주소
			System.out.println("c와 d의 참조값은 같다.");
		}
		else {
			System.out.println("c와 d의 참조값은 다르다.");
		}
		
		if(c.equals(d)) {
			System.out.println("c와 d의 문자열은 같다.");
		}
		else {
			System.out.println("c와 d의 문자열은 다르다.");
		}
		System.out.println();
		
		
		String e = "오늘 날짜는 "+2023+2+10; 
		System.out.println(e);
		String f = "오늘 날짜는 "+(2023+2+10);
		System.out.println(f);
		//문자열은 편집이 안된다.(한번 만들어진 문자열은 불변!) -> 메모리에 4번의 생성이 일어난다 <-> StringBuffer(편집가능)
		
		
		System.out.println("문자열 크기 = "+ e.length());
		
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+" : "+ e.charAt(i));
		}
		System.out.println("부분 문자열 추출="+e.substring(7));
		System.out.println("부분 문자열 추출="+e.substring(7,11));
		
		System.out.println("대문자 변경="+"Hello".toUpperCase());
		System.out.println("소문자 변경="+"Hello".toLowerCase());
		
		System.out.println("문자열 검색="+e.indexOf("짜"));
		System.out.println("문자열 검색="+e.indexOf("날짜"));
		System.out.println("문자열 검색="+e.indexOf("개바부"));//-1
		
		System.out.println("문자열 치환="+e.replace("날짜","일자"));
		
	

	}

}
