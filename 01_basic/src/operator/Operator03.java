package operator;

public class Operator03 {

	public static void main(String[] args) {
		//���׿�����
		//1.���Կ�����
		int a=5;
		a+=2;;//a=a+2;
		a*=3;
		a/=5;
		System.out.println("a = "+a);
		
		//2.����������
		a++;
		System.out.println("a = "+a);
		
		int b = a++; // 1. int b =a; 2. a++;
		//int b = ++a; //1. ++a; 2. int b = a;
		System.out.println("a = "+a+" b = "+b);
		
		int c = ++a * b--; //1. ++a 2. int c = a*b 3. b--
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		
		System.out.println("a++ = "+a++);
		
		System.out.println("a = "+a);

	}

}