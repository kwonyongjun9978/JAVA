package basic;

public class Calc {

	public static void main(String[] args) {
		/*
		[����] 320(a), 258(b)�� ������ �����Ͽ� ��(sum), ��(sub), ��(mul), ��(div)�� ���Ͻÿ�
		��, �Ҽ����� 2°�ڸ����� ����Ͻÿ�
		[������]
		320 + 258 = xxx
		320 - 258 = xxx
		320 * 258 = xxx
		320 / 258 = x.xx
		*/
		int a = 320; 
		int b = 258;
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		double div = ((double)a/b);
		
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+mul);
		System.out.println(a+" / "+b+" = "+String.format("%.2f", div));
		
		System.out.printf("%d + %d = %d\n",a,b,sum);
		System.out.printf("%d - %d = %d\n",a,b,sub);
		System.out.printf("%d * %d = %d\n",a,b,mul);
		System.out.printf("%d / %d = %.2f\n",a,b,div);
		
		/*
		//print vs println vs printf
		int num = 9978;
		System.out.print("print ! " + num + "\n");	//print : ��ȣ�� ������ �ܼ��� ���. ���๮��(\n) ����X.
											//		    	  ����(int, float, double ��)�� ���ֹ��� �ʴ� ���ڸ� �״�� ����ϰ� ���� �� ����Ѵ�.			
		System.out.println("println ! " + num);		//println : ��ȣ�� ������ ����� �� �������� ���๮�ڰ� ���ԵǾ� �־� ����� �� �� �����.
											//          		print�� �����ϰ� ����(int, float, double ��)�� ���ֹ��� �ʴ� ���ڸ� �״�� ����ϰ� ���� �� ����Ѵ�.
		System.out.printf("printf ! %d \n", num);	//printf  : C��� ������ printf�� ����. %d, %s ���� �������� ���. ���๮�� ����X
											//          		������ �Ű����� �� ���(int, long, float, double ��)
		*/
		
		/*
		���Ĺ���
		%d : ����
		%f : �Ǽ�
		%c : ����
		%s : ���ڿ�
		*/
		
		/*
		//����
		System.out.println("25 + 3 = " + 25 + 3);
		System.out.println("25 + 3 = " + (25 + 3));
		*/
		
		
	}

}