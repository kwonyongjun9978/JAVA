package operator_01;

public class Dice {

	public static void main(String[] args) {
		int dice1, dice2;
		
		dice1 = (int)(Math.random()*6)+1;
		dice2 = (int)(Math.random()*6)+1;
		
		System.out.println("�ֻ���1 : "+dice1+"\t�ֻ���2 : "+dice2);
		if(dice1>dice2){
			System.out.println("�ֻ���1 ��");
		}else if(dice1<dice2){
			System.out.println("�ֻ���2 ��");
		}else {
			System.out.println("���º�");
		}
	}

}
/*
[����] �ֻ��� ���� - ����
2���� �ֻ����� ������ ū���� ���� �ֻ����� ���̴�.
�ֻ��� ���� �յ� ����Ͻÿ�
[������]
�ֻ���1 : 3   �ֻ���2 : 1
�ֻ���1 ��
-----------------------------
�ֻ���1 : 4   �ֻ���2 : 6
�ֻ���2 ��
-----------------------------
�ֻ���1 : 3   �ֻ���2 :3
���º�

x ~ y ������ ����
(int)(Math.random() * (y-x+1) + x)

ex) 65~90 ������ ���� => (int)(Math.random() * 26 + 65)
*/
