package array;

import java.util.Scanner;

public class BaseBall02 {

	public static void main(String[] args) {
		int[] com = new int[3];
		int[] user = new int[3];
		int strike=0;
		int ball=0;
		Scanner sc = new Scanner(System.in);
		String yn;
		
		do {
			System.out.print("������ �����Ͻðڽ��ϱ�(Y/N) : ");
			yn = sc.next();
			
		}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
		
		if(yn.equals("Y") || yn.equals("y")) {
			System.out.println("������ �����մϴ�");
			
			//��ǻ�Ͱ� ���� �߻�
			for(int i =0; i<com.length; i++) {
				com[i] =(int)(Math.random()*9+1);
				
				//�ߺ�����
				for(int j=0; j < i; j++) {
					if(com[i] == com[j]) {
						i--;
						break; //for j�� �����	
					} //for j
				} //for i
			}
			System.out.print(com[0]+", "+com[1]+", "+com[2]);
			
			//����� ���� �Է�
			while(true) {
				System.out.println();
				System.out.print("���� �Է� : ");
				String num = sc.next();
				
				user[0]=num.charAt(0)-'0'; //0(0) '0'(48)
				user[1]=num.charAt(1)-48;
				user[2]=num.charAt(2)-48;
				System.out.println(user[0]+", "+user[1]+", "+user[2]);
				
				//��
				strike = ball =0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						
						if(com[i]==user[j]) {
							if(i==j) {
								strike++;
							}
							else {
								ball++;
							}
						}
					}//for j
				}//for i
				
				System.out.println(strike+"��Ʈ����ũ\t"+ball+"��");
				if(strike == 3) {
					System.out.println("����!");
					break; //while�� �����
				}
			}//while
		}
		else {
			System.out.println("���α׷��� �����մϴ�.");
		}

	}

}
