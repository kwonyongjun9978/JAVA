package operator_01;

public class Comp {

	public static void main(String[] args) {
		char ch = 'B';
		int result = ch >= 'A' && ch <= 'Z' ? ch+32 : ch-32; 
		System.out.println(ch + " -> " +(char)result);
		
		char ch1 = 'B';
		System.out.println(Character.toLowerCase(ch1));
		char ch2 = 'b';
		System.out.println(Character.toUpperCase(ch2));

	}

}
/*
�빮�ڴ� 65~90 �ҹ��ڴ� 97~122
[����] ������ ���� �빮���̸� �ҹ��ڷ� ��ȯ�ؼ� ���, �ҹ����̸� �빮�ڷ� ��ȯ�ؼ� ����Ͻÿ�
[������]
B �� b         e �� E
*/