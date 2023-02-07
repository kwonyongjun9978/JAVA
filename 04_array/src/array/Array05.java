package array;

public class Array05 {

	public static void main(String[] args) {
		//����for��
		char [] ar = new char[50]; //50���� ���ڸ� ������ �迭 ����
		int[] count = new int[26]; //26���� ���ĺ��� ������ ������ �迭 ����
		int eng;
		
		for(int i=0; i<50; i++) { //50�� �ݺ�
			eng=(int)(Math.random()*26)+65; //65���� 90������ ���� ����
			ar[i]=(char)eng; //������ ���� ����
			count[eng-65]++; //�ش� ���ĺ��� ���� ����
			System.out.print(ar[i]+" "); //�迭�� ����� ���� ���
			if(i%10==9) { //10���� ����ϱ� ���� ����
				System.out.println(); //10�� ��� �� �ٹٲ�
			}
		}
		System.out.println();
		for(int i=0; i<count.length; i++) { //26���� ���ĺ� ���� ���
			System.out.print((char)(i+65)+" : "+count[i]+"\t"); //���ĺ� ���� ���
			if((i+1)%4==0)System.out.println();
		}

	}

}
/*
[����] ũ�Ⱑ 50���� ���ڹ迭�� ��Ƽ� 65~90������ ������ �߻��Ͽ� ���� �� ����Ͻÿ�
- 1�ٿ� 10���� ���
- A�� ����? B�� ����? C�� ����? ~~~ Z�� ���� ?
[������]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C
A : 2
B : 3
...
X : 0
Y : 1
Z : 0
*/