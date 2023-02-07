package array;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto= new int[6];
		//������ȣ ����
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			//�ߺ���ȣ ����
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		//�������� ����
		for(int i=0; i<lotto.length; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(String.format("%4d",lotto[i])); 
		

	}

}
}

/*
[����] �ζ� - �ڵ�
- ũ�Ⱑ 6���� �迭 ����
- 1 ~ 45 ������ ���� �߻�
- ���ڴ� ���������Ͽ� ���(Selection Sort)
- ��½� �ڸ����� 5�ڸ��� ����
- �ߺ� ���ڰ� ������ �ȵȴ�

[������]
 2 4 19 39 43 44
 */
