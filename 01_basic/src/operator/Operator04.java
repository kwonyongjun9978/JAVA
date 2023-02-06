package operator;

public class Operator04 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ((num1+=10)<0 && (num2+=10)>0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+" num2 =  "+num2);
		// &&,|| :  (num1+=10)<0 연산 결과가 False이므로 앞 연산만 진행후 종료
		// &,| : (num1+=10)<0 연산 결과가 False여도 뒤에까지 연산한후 종료 
	}

}
