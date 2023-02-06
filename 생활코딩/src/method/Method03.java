package method;

public class Method03 {
	//method output
	public static String a( ) {
		//...
		return "a";
	}
	
	public static int one( ) {
		return 1;
		//...
	}
	//return값이 없는 method를 만들때는 void를 사용
	public static void main(String[] args) {
		System.out.println(a());
		System.out.println(one());

	}

}