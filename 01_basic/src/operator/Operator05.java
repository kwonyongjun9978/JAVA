package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a = "+a);
		System.out.println("!a = "+!a);
		System.out.println();
		
		String b ="apple"; //literal 생성
		System.out.println(b);
		String c =new String("apple"); //인스턴스화
		System.out.println(c);
		
		String result = b==c ? "같다" : "다르다";//메모리의 주소 비교
		System.out.println("b == c : "+ result);
		System.out.println("b != c : "+ (b!=c ? "참" : "거짓"));
		String result2 = b.equals(c)? "같다" : "다르다"; //문자열 비교
		System.out.println("b.equals(c) : "+result2);
		System.out.println("!b.equals(c) : "+(!b.equals(c)? "참" : "거짓"));
	}
}