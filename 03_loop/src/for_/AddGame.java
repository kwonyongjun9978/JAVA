package for_;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, c=0, count=0, i;
	for(i=1; i<=5; i++) {
	a =(int)(Math.random()*90)+10;
	b =(int)(Math.random()*90)+10;
	for(int j=1; j<=2; j++) {
		System.out.print("["+i+"]"+" "+a+" + "+b+" = ");
		int dab = sc.nextInt();
		if(dab == (a+b)) {
			count+=20;
			c+=1;
			System.out.println("GOOD");
			break;
		}
		else {
			if(j==1)System.out.println("�� Ʋ�Ⱦ�~");
			else if(j==2)System.out.println("�Ѥ� "+(a+b));
		}
	}
		
	}
	System.out.println("����� �� "+c+"������ ���߾ ����"+count+"�� �Դϴ�.");
	}
}