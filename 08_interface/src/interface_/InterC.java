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
extends(���) �ϴ� ���, �߻�޼ҵ�� �ݵ�� Sub Class���� Override �� �� �־�� �Ѵ�.
but, ���� �������̽�(Inter C)������ ���� �������̽�(Inter A, Inter B)�� �߻� �޼��带 �ݵ�� �������̵�(override)�� �ʿ�� ����.
�� ���, ���� �������̽�(InterC)�� ����(implement)�� Ŭ����(InterMain)���� ���� �������̽�(Inter A, Inter B)�� �߻� �޼��带 ��� �����ؾ� �մϴ�.

interface�� ��� ����
class�� ���߻���� �Ұ���������, interface�� ���߻�� ����
��, ���(extends)�� ��� class extends class, interface extends interface �� ����(Mix X)

[EX] �´� ������ ��� ���ÿ�
class A{}
interface InterA{}

1. class B extends A { }   0
2. class B implements InterA { } 0
3. class B implements A { } x
4. class B extends InterA { } x
5. interface InterB  extends A { } x
6. interface InterB  implements InterA { } x --> class B implements InterA { }
7. interface InterB  implements A { } x
8. interface InterB  extends InterA { } o


����� �߻�޼ҵ常 ����(�ʵ� ���� X)
�������̽������� ��ü ���� X -> �������̽��� ������ ������ (�������̽��� ������)Ŭ������ ��ü�� ����, �͸� ���� Ŭ���� ���
*/
}
