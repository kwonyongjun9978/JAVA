package basic;

public class Sungjuk {

	public static void main(String[] args) {
		/*
		[����] �������
		�̸�(name)�� L �̰� ��������(kor) 85��, ��������(eng) 78��, ��������(math) 100�϶�
		����(tot)�� ���(avg)�� ���Ͻÿ�.
		��, ����� �Ҽ����� 2°�ڸ����� ����Ͻÿ�.
		���� = �������� + ���� ���� + ���� ����
		��� = ���� / �����
		[������]
		   *** L ����ǥ ***
		����    ����    ����    ����    ���
		85     78    100   xxx    xx.xx
		 */
		int kor = 85;
		int eng = 78; 
		int math = 100;
		int tot = kor+eng+math; 
		double avg = tot/3.0;
		char name = 'L';

		System.out.println("\t***  " + name + "  ����ǥ  ***");
		System.out.println("����\t����\t����\t����\t���");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg));
		
		System.out.printf("\t***  %c  ����ǥ   ***\n", name);
		System.out.printf("����\t����\t����\t����\t���\n");
		System.out.printf("%d\t%d\t%d\t%d\t%.2f", kor,eng,math,tot,avg);
		
	}

}