package array;

public class Array01 {

	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];
		System.out.println("�迭�� ar = "+ar); //�ּ�(Ŭ����@16����)
		ar[0]=25;
		ar[1]=37;
		ar[2]=55;
		ar[3]=42;
		ar[4]=30;
		System.out.println("ar[0] = "+ar[0]);
		System.out.println("ar[1] = "+ar[1]);
		System.out.println("ar[2] = "+ar[2]);
		System.out.println("ar[3] = "+ar[3]);
		System.out.println("ar[4] = "+ar[4]);
		System.out.println();
		
		System.out.println("�迭 ũ�� = "+ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("�Ųٷ� ���");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("Ȧ�� �����͸� ���");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 == 1) {
				System.out.println("ar["+i+"] = "+ar[i]);
			}
		}
		System.out.println();
		
		System.out.println("Ȯ�� for");
		for(int data : ar) { //ar�� ũ�⸸ŭ for���� �ݺ��Ѵ�.
			System.out.println(data);
		}
	
	}

}