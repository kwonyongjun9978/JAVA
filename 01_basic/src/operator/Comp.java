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
 �빮�ڴ� 65~90 �ҹ��ڴ� 97~122
[����] ������ ���� �빮���̸� �ҹ��ڷ� ��ȯ�ؼ� ���, �ҹ����̸� �빮�ڷ� ��ȯ�ؼ� ����Ͻÿ�
[������]
B �� b         e �� E
*/