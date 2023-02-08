package class_;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ƚ�� �Է� : ");
		int co = sc.nextInt();
		Compute[] ar = new Compute[co];
		for(int i=0; i<co; i++) {
			System.out.println("["+(i+1)+"]��°");
			System.out.print("x �Է� : ");
			int x = sc.nextInt();
			System.out.print("y �Է� : ");
			int y = sc.nextInt();
			
			//class����
			ar[i]=new Compute();
			ar[i].setData(x, y);
			ar[i].calc();
		}
		System.out.println("x\ty\tsum\tsub\tmul\tdiv");
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i].getX()+"\t"+
					ar[i].getY()+"\t"+ar[i].getSum()+"\t"+
					ar[i].getSub()+"\t"+ar[i].getMul()+"\t"+
					ar[i].getDiv());
			}	
	}
}

/*
[����] ��Ģ����
x, y�� �Է��Ͽ� ��, ��, ��, ���� ���Ͻÿ�

Ŭ������ : Compute (1�κ�)
�ʵ� : x, y, sum, sub, mul, div
�޼ҵ� : setData(x�� ��, y�� ��)
        calc()
        getX()
        getY()
        getSum()
        getSub()
        getMul()
        getDiv()
        
Ŭ������ : ComputeMain        

[������]
Ƚ�� �Է� : 2

[1��°]
x �Է� : 25
y �Է� : 36

[2��°]
x �Է� : 35
y �Է� : 12

x   y   sum      sub      mul      div
25   36
35   12
*/