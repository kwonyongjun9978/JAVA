package array;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		int[] com = new int[3];
		int[] user = new int[3];
		int strike = 0; 
		int ball = 0; 
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ �����Ͻðڽ��ϱ�(Y/N) : ");
			String yn = sc.next();
			
			if(yn.equals("y") || yn.equals("Y")) { 
				System.out.println("������ �����մϴ�");
				
				for(int i=0; i<com.length; i++) {
					
					com[i] = (int)(Math.random()*9+1);
					
						for(int j=0; j < i; j++) {
							if(com[i] == com[j]) {
								i--;
								break;	
							}
						}	
				} //for
				
				for(int data : com) {
					System.out.print(data + " ");
				}
				System.out.println();
			
				while(true) {
					
					System.out.print("���� �Է� : ");
					int num = sc.nextInt();
					user[0]=num/100;
					user[1]=(num%100)/10;
					user[2]=(num%100)%10;
					
					for(int i=0; i<3; i++) {
						
						for(int j=0; j<3; j++) {
							
							if(user[i]==com[j] && i == j) {	
								strike++;
							}
							if(user[i]==com[j] && i != j) {
								ball++;
							}
						}
					}
					System.out.println(strike + "��Ʈ����ũ" + ball + "��");
					
		        	if(strike == 3) {
		            System.out.println("����!");
		            break;
					}
		        	
				}//while
				}//if
			else{
				System.out.println("���α׷�����");
			}
	}

}

/*
[����] �߱�����
ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ�
�߻��� ���ڸ� ���ߴ� ����
��, �ߺ��� �����Ѵ�

[������]
������ �����Ͻðڽ��ϱ�(Y/N) : w
������ �����Ͻðڽ��ϱ�(Y/N) : u
������ �����Ͻðڽ��ϱ�(Y/N) : y

������ �����մϴ�

�����Է� : 123
0��Ʈ����ũ 0��

�����Է� : 567
0��Ʈ����ũ 2��

�����Է� : 758
1��Ʈ����ũ 2��
...

�����Է� : 785
3��Ʈ����ũ 0��

���α׷��� �����մϴ�.
*/