package collection_10;

public class Test {

	public static void main(String[] args) {
		Student a = new Student(17, 2);	// 17�� 2��
		Student b = new Student(18, 1);	// 18�� 1��
		
		
		int isBig = a.compareTo(b);	// a�ڱ��ڽŰ� b��ü�� ���Ѵ�.
		
		if(isBig > 0) {
			System.out.println("a��ü�� b��ü���� Ů�ϴ�.");
		}
		else if(isBig == 0) {
			System.out.println("�� ��ü�� ũ�Ⱑ �����ϴ�.");
		}
		else {
			System.out.println("a��ü�� b��ü���� �۽��ϴ�.");
		}
	}

}
