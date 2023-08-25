package constructor;

public class VarArgs {
	public VarArgs() {
		System.out.println("기본 생성자");
	}
	
//	int sum(int a, int b) {
//		return a+b;
//	}
//	int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	int sum(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}
	public int sum(int...ar) {
		int hap=0;
		for(int i=0; i<ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	}
	
	public static void main(String[] args) {
		VarArgs va = new VarArgs(); //기본 생성자 생성
		
		System.out.println("합 = "+va.sum(10,20));
		System.out.println("합 = "+va.sum(10,20,30));
		System.out.println("합 = "+va.sum(10,20,30,40));

	}

}

/*
...ar는 자바에서 "varargs" 또는 "variable-length argument"를 나타내는 특별한 문법입니다. 
이를 통해 메서드에 가변 개수의 인자를 전달할 수 있습니다. 
메서드 정의에서 파라미터 타입 뒤에 ...를 사용하여 표시하며, 이를 통해 메서드 호출 시 전달되는 인자의 개수가 유동적으로 처리될 수 있습니다.
*/
