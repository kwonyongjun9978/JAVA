package class_;

public class SungJukMain {

	public static void main(String[] args) {
		Sungjuk aa = new Sungjuk();
		aa.setData("ȫ�浿", 91, 95, 100);//ȣ��
		aa.calc();
		System.out.println(aa.getName()+"\t"+
		aa.getKor()+"\t"+aa.getEng()+"\t"+
		aa.getMath()+"\t"+aa.getTot()+"\t"+
		aa.getAvg()+"\t"+aa.getGrade());
		
		Sungjuk bb = new Sungjuk();
		bb.setData("���ε�", 100, 89, 75);//ȣ��
		bb.calc();
		System.out.println(bb.getName()+"\t"+
		bb.getKor()+"\t"+bb.getEng()+"\t"+
		bb.getMath()+"\t"+bb.getTot()+"\t"+
		bb.getAvg()+"\t"+bb.getGrade());
		
		Sungjuk cc = new Sungjuk();
		cc.setData("������", 75, 80, 48);//ȣ��
		cc.calc();
		System.out.println(cc.getName()+"\t"+
		cc.getKor()+"\t"+cc.getEng()+"\t"+
		cc.getMath()+"\t"+cc.getTot()+"\t"+
		cc.getAvg()+"\t"+cc.getGrade());
		

	}

}
/*
[����] ���� ó��
- ����, ���, ������ ���Ͻÿ�
- ����� �Ҽ����� 2°�ڸ����� ���

���� = ���� + ���� + ����
��� = ���� / �����
������ ����� 90 �̻��̸� 'A'
      ����� 80 �̻��̸� 'B'
      ����� 70 �̻��̸� 'C'
      ����� 60 �̻��̸� 'D'
      �׿ܴ� 'F'
      
Ŭ������ : SungJuk
�ʵ�    : name, kor, eng, math, tot, avg, grade  
�޼ҵ�   : setData(�̸�, ����, ����, ����)
          calc() - ����, ���, ���� ���
          getName()
        getKor()
        getEng()
        getMath()
         getTot()
         getAvg()
         getGrade()
         
Ŭ������ : SungJukMain         

[������]
----------------------------------------------------
�̸�      ����      ����      ����      ����      ���      ����
----------------------------------------------------
ȫ�浿   90      95      100
----------------------------------------------------
*/
