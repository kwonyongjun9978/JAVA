package array;

public class Array02 {

	public static void main(String[] args) {
		String[] ar = {"ȣ����", "����", "�ڳ���", "�⸰", "���ֳ̾�", "���ȿ�����", "����"};
		
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = "+ar[i]);
			System.out.println("���ڿ��� ũ�� = "+ar[i].length());
			System.out.println("ù��° ���� = "+ar[i].charAt(0));
			System.out.println("������ ���� = "+ar[i].charAt(ar[i].length()-1));
			System.out.println();
		}
		
		System.out.println("Ȯ�� for");
		for(String data : ar) {
			System.out.println(data);
		}
		

	}

}
