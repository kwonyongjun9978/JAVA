package constructor;

import java.util.Scanner;

public class MemberService {
	Scanner sc = new Scanner(System.in);
	private MemberDTO[] ar = new MemberDTO[5]; //��ü �迭

//	public MemberService() {
//		System.out.println("�⺻ ������");
//	}
	public void menu(){
		int num;
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println("1. ����");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. Ż��");
			System.out.println("5. ������");
			System.out.println("************");
			System.out.print("��ȣ : ");
			num = sc.nextInt();
			
			System.out.println();
			
			if(num == 5) break; //while�� ����� 
			if(num == 1) insert();
			else if(num == 2) list();
			else if(num == 3) update();
			else if(num == 4) delete();
		} //while		
	}// menu()
	
	public void delete() {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phone = sc.next();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				if(ar[i].getPhone().equals(phone)) {
					ar[i]=null;
					
					System.out.println("1 row deleted");
					
					break;
				}
			}
		}
		if(i == ar.length) System.out.println("ã�� ȸ���� �����ϴ�");
	}
	
	public void update() {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phone = sc.next();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				if(ar[i].getPhone().equals(phone)) { // == �ּ� ��
					System.out.println(ar[i].getName()+"\t"+
							ar[i].getAge()+"\t"+
							ar[i].getPhone()+"\t"+
							ar[i].getAddress());
					
					System.out.println();
					System.out.print("���� �� �̸� �Է� : ");
					String name = sc.next();
					System.out.print("���� �� �ڵ��� �Է� : ");
					phone = sc.next();
					System.out.print("���� �� �ּ� �Է� : ");
					String address = sc.next();
					
					ar[i].setName(name);
					ar[i].setPhone(phone);
					ar[i].setAddress(address);
					
					System.out.println("1 row(s) updated");
					break;
				}
			}
		}
		
		if(i == ar.length) System.out.println("ã�� ȸ���� �����ϴ�");
		} //i == ar.length -> for���� �� ���Ҵ�
	
	public void list() {
		for(MemberDTO dto : ar) {
			if(dto != null)
				System.out.println(dto.getName()+"\t"+
									dto.getAge()+"\t"+
									dto.getPhone()+"\t"+
									dto.getAddress());
			
		}
		
		if(ar[0]==null&&ar[1]==null&&ar[2]==null&&ar[3]==null&&ar[4]==null) {
			System.out.println("���� �����ڰ� �����ϴ�.");
			
		}
	}
	
	public void insert() {
	    int i;
	      for(i=0; i<ar.length; i++) {
	         if(ar[i] == null) break;
	      }
	      if(i == ar.length) {
	         System.out.println(ar.length + "���� ������ �� á���ϴ�");
	         return; //�Լ��� �����
	      }
	      
	      //������ �Է�
	      System.out.print("�̸� �Է� : ");
	      String name = sc.next();
	      System.out.print("���� �Է� : ");
	      int age = sc.nextInt();
	      System.out.print("�ڵ��� �Է� : "); 
	      String phone = sc.next();
	      System.out.print("�ּ� �Է� : "); 
	      String address = sc.next();
	      
	      for(i=0; i<ar.length; i++) {
	         if(ar[i] == null) { 
	            ar[i] = new MemberDTO(name, age, phone, address);
	            break; //for�� �����
	         }
	      }      
	      
	      System.out.println("1 row created");
	}	
}

