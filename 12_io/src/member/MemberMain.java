package member;

public class MemberMain {
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		memberService.menu();
		
	}

}
/*
[����] ȸ������

* ����
- ȸ���� �Է¹޾Ƽ� ���Ͽ� �����ϰų� ������ ������ �о�´�.
- MemberService Ŭ������ �޴� �޼ҵ� �ۼ��Ѵ�.
  �޴��� ���� ������ Ŭ������ �ۼ��Ѵ�.
- ȸ���� ������ �̸�, ����, �ڵ���, �ּҷ� �Ѵ�.
- member.txt ������ ������ �о� List�� �����ϼ��� => 2�� ȣ���ϸ� ������ ��µȴ�.
  (������ ���Դϱ�? EOF(End of File)
  
1. Ŭ���� �ۼ�
MemberMain.java

MemberService.java
- �޴� �ۼ�

MemberDTO.java
- �ʵ�, ������, setter, getter

MemberInsert.java
MemberPrint.java
MemberPhoneSearch.java
MemberNameAsc.java
MemberFileInput.java
MemberFileOutput.java

2. �������̽� �ۼ�

Member.java
- �߻�޼ҵ� public void execute();


menu()
********************
  1. ���
  2. ���
  3. �ڵ��� �˻�
  4. �̸����� ��������
  5. ���� ����
  6. ���� �б�
********************
  ��ȣ : 
*/  
