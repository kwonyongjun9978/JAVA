package operator;

public class Comp {

	public static void main(String[] args) {
		
		char ch0 = 'B';
		System.out.println(Character.toLowerCase(ch0));
		char ch1 = 'e';
		System.out.println(Character.toUpperCase(ch1));
		
		
		char ch = 'B';
        //char ch = 'E';   
        int result = ch >= 'A' && ch <= 'Z' ? ch + 32 : ch - 32;
        System.out.println(ch + " -> " + (char)result);
	}
}
/*
 대문자는 65~90 소문자는 97~122
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오
[실행결과]
B → b         e → E
*/