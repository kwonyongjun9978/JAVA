package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x,y;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x �Է� : ");
		this.x = sc.nextInt();
		System.out.print("y �Է� : ");
		this.y = sc.nextInt();
	}
	
	public void output(){
		
		if(y >= 0) {
			int mul =1;
			for(int i=1; i<=this.y; i++) {
				mul *= this.x;
			}
			System.out.println(x+"��"+y+"���� "+mul);
		}else {
			//System.out.println("y�� 0���� ũ�ų� ���ƾ� �Ѵ�.");
			
			//�����ڰ� ������ Exception �߻�
			try {
				throw new Exception("y�� 0���� ũ�ų� ���ƾ� �Ѵ�.");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();



	}

}

/*
[����] ���� ����
- x�� y���� ó�� �Ѵ�.
- for���� �̿��Ͽ� ó���Ѵ�.

[������]
x �Է� : 2
y �Է� : 10         input()
----------------------------------
2�� 10���� xxx        output() 
*/
