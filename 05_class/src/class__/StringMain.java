package class__;

public class StringMain {

	public static void main(String[] args) {
		String a= "apple"; //literal ����(but ��� class�� new �����ڷ� �����ؾ� �Ѵ�)
		String b= "apple";
		if(a==b) { //�ּ� ��
			System.out.println("a�� b�� �������� ����.");
		}
		else {
			System.out.println("a�� b�� �������� �ٸ���.");
		}
		
		if(a.equals(b)) { //���ڿ� ��
			System.out.println("a�� b�� ���ڿ��� ����.");
		}
		else {
			System.out.println("a�� b�� ���ڿ��� �ٸ���.");
		}
		System.out.println();
		
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) { //�ּ�
			System.out.println("c�� d�� �������� ����.");
		}
		else {
			System.out.println("c�� d�� �������� �ٸ���.");
		}
		
		if(c.equals(d)) { //���ڿ� ��
			System.out.println("c�� d�� ���ڿ��� ����.");
		}
		else {
			System.out.println("c�� d�� ���ڿ��� �ٸ���.");
		}
		System.out.println();
		
		
		String e = "���� ��¥�� "+2023+2+10; 
		System.out.println(e);
		String f = "���� ��¥�� "+(2023+2+10);
		System.out.println(f);
		//���ڿ��� ������ �ȵȴ�.(�ѹ� ������� ���ڿ��� �Һ�!) -> �޸𸮿� 4���� ������ �Ͼ�� <-> StringBuffer(��������)
		
		
		System.out.println("���ڿ� ũ�� = "+ e.length());
		
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+" : "+ e.charAt(i));
		}
		System.out.println("�κ� ���ڿ� ����="+e.substring(7));
		System.out.println("�κ� ���ڿ� ����="+e.substring(7,11));
		
		System.out.println("�빮�� ����="+"Hello".toUpperCase());
		System.out.println("�ҹ��� ����="+"Hello".toLowerCase());
		
		System.out.println("���ڿ� �˻�="+e.indexOf("¥"));
		System.out.println("���ڿ� �˻�="+e.indexOf("��¥"));
		System.out.println("���ڿ� �˻�="+e.indexOf("���ٺ�"));//-1
		
		System.out.println("���ڿ� ġȯ="+e.replace("��¥","����"));
		
	

	}

}
