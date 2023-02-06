package basic;

public class MethodTest01 {

	public static void main(String[] args) {
		//25, 36중 큰값을 구하시오
		//자바의 기본(default, 자바도 알고 있는) 패키지 => java.lang
		int big = Math.max(25, 36); //java.lang패키지안의 Math클래스에서 max라는 메소드를 호출한다
		System.out.println("최대값은? "+big);
		
		//25.8, 78.6중 작은값을 구하시오
		double small = Math.min(25.8,78.6);
		System.out.println("최소값은? "+small);
		
		//250을 2진수로 출력하시오
		String binary = Integer.toBinaryString(250);
		System.out.println("2진수 = "+binary);
		
		//250을 8진수로 출력하시오
		String oct = Integer.toOctalString(250);
		System.out.println("8진수 = "+oct);
		
		//250을 16진수로 출력하시오
		String hexa = Integer.toHexString(250);
		System.out.println("16진수 = "+hexa);
	}

}