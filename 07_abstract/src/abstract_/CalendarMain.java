package abstract_;

public class CalendarMain {

	public static void main(String[] args) {
		CalendarEx c = new CalendarEx();
		c.calc();
		c.display();

	}

}
/*
[����] ����޷�
- �⵵, ���� �Է��Ͽ� �޷��� �ۼ��Ͻÿ�

         
Ŭ������ : CalendarEx
�ʵ� : 
�޼ҵ� : 	�⺻������ : �Է�
	   	calc() -> �Ŵ� 1���� ������ ��������? (Calendar�� �޼ҵ� �غ�)
               -> �Ŵ� �������� 28, 29, 30, 31 ��������? (Calendar�� �޼ҵ� �غ�)
        display() ���


[������]
�⵵ �Է� : 2002
�� �Է� : 10   

��   ��   ȭ   ��   ��   ��   ��
      1   2   3   4   5
6   7   8   9   10   11   12
13   14   15   16   17   18   19
20   21   22   23   24   25   26
27   28   29   30   31
*/
