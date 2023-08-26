package array_04;

public class Array05 {

	public static void main(String[] args) {
		char[] ar = new char[50];
		int[] count = new int[26];
		
		for(int i=0; i<ar.length; i++) {
			int eng = (int)(Math.random()*26)+65;
			ar[i]=(char)eng;
			count[eng-65]++;
			System.out.print(ar[i]+" ");
			if((i+1)%10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		for(int i=0; i<count.length; i++) {
			System.out.println((char)(i+65)+" : "+count[i]);
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
