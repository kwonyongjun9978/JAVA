package interface_;

public interface InterC extends InterA, InterB{ //���� ��� ����
	//�߻� �޼ҵ� 4��
//	@Override
//	default void aa() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	default void b() {
//			// TODO Auto-generated method stub
//			
//	}
//	
//	@Override
//	default void cc() {
//			// TODO Auto-generated method stub
//			
//	}
//	
//	@Override
//	default void dd() {
//			// TODO Auto-generated method stub
//			
//	}
	
/*
���� �������̽�(Inter C)������ ���� �������̽�(Inter A, Inter B)�� �߻� �޼��带 �ݵ�� �������̵�(override)�� �ʿ�� �����ϴ�.
�� ���, ���� �������̽��� ����(implement)�� Ŭ����(InterMain)���� ���� �������̽�(Inter A, Inter B)�� �߻� �޼��带 ��� �����ؾ� �մϴ�.


interface�� ��� ����
class�� ���߻���� �Ұ���������, interface�� ���߻�� ����
��, ���(extends)�� ��� class extends class, interface extends interface �� ����(Mix X)

����� �߻�޼ҵ常 ����(�ʵ� ���� X)
�������̽������� ��ü ���� X -> �ٸ� Ŭ������ ���Ͽ� �����ɼ� �ִ�(�������̽��� ���ǵ� �߻� �޼ҵ��� ��ü�� �����Ѵٴ� �ǹ�)

*/
}
