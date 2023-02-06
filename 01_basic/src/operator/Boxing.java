package operator;

public class Boxing {

	public static void main(String[] args) {
		int a =25;
		double b = (double)a /3; //Casting, 강제형변환 / 자동형변환 
		System.out.println(b); 
		
		String c = "25";
		//int d =(int)c; //d:기본형,c:객체형 / (기본형)객체형 /error
		int d = Integer.parseInt(c);
		System.out.println(d);
		
		int e=5;
		//객체형    기본형 
		Integer f=e; //JDK 5.0, AutoBoxing(기본형 -> 객체형)
		//Integer f = new Integer(e); //JDK 5.0이전,deprecate
		System.out.println(f);
		
		Integer g =5;
		int h=g; //JDK 5.0, unAutoBoxing(객체형 -> 기본형)
		//int h = g.intValue(); //JDK 5.0이전
		System.out.println(h);
	
		/*
		객체형
		기본형 -----> 객체형(클래스화, Wrapper Class (포장시킴))
		int           Integer
		double        Double
		 */
	}
}