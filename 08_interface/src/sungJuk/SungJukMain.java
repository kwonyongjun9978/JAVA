package sungJuk;

public class SungJukMain {

	public static void main(String[] args) {
		SungJukService sungJukService = new SungJukService();
		sungJukService.menu();
		System.out.println("���α׷��� �����մϴ�.");

	}

}
/*
Package   : sungJuk

Interface : SungJuk.java
�߻�޼ҵ�   : public void execute(~~~);

Class     : SungJukDTO.java - 1�κ�
            SungJukInsert.java
            SungJukList.java
            SungJukUpdate.java
            SungJukDelete.java
            SungJukSort.java
            SungJukService.java - menu() �ۼ�
            SungJukMain.java

[����]
1. SungJukDTO.java
�ʵ� : ��ȣ(�ߺ�X), �̸�, ����, ����, ����, ����, ���
�޼ҵ� : �����ڸ� �̿��Ͽ� ������ ���
       setter / getter
       calc - ����, ����ϴ� ���

2. SungJukService.java
- menu() �� �ۼ��Ѵ�.

3. SungJukInsert.java
- ��ȣ, �̸�, ����, ����, ���и� �Է��Ͽ� ������ ����� ����Ѵ�.

��ȣ �Է� : 
�̸� �Է� : 
���� �Է� : 
���� �Է� : 
���� �Է� : 

�ԷµǾ����ϴ�

4. SungJukList.java
- ArrayList�� ����� ��� �����͸� ����Ѵ�.
- �Ҽ����� 2°�ڸ����� ����Ѵ�.
 
��ȣ   �̸�   ����   ����   ����    ����   ���

5. SungJukUpdate.java
- ���� ��ȣ�� �ԷµǸ� "�߸��� ��ȣ �Դϴ�." ��� ����Ѵ�.
- �ִ� ��ȣ�� �ԷµǸ� ��ȣ�� �ش��ϴ� ����Ʋ ��� �� �����Ѵ�.
��ȣ �Է� : 
�߸��� ��ȣ �Դϴ�.

�Ǵ� 

��ȣ   �̸�   ����   ����   ����    ����   ���

���� �� �̸� �Է� : 
���� �� ���� �Է� : 
���� �� ���� �Է� : 
���� �� ���� �Է� : 

�����Ͽ����ϴ�.

6. SungJukDelete.java
- ���� ��ȣ�� �ԷµǸ� "�߸��� ��ȣ �Դϴ�." ��� ����Ѵ�.

7. SungJukSort.java 
*/
