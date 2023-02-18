package inheritance;

import java.util.Scanner;


class Shape{
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public Shape() {
		System.out.println("Shape �⺻������");
	}
	
	public void calcArea() {
		System.out.println("������ ����մϴ�");
	}
	
	public void disArea() {
		System.out.println("������ ����մϴ�");
	}
}

//�ﰢ��class
class Sam extends Shape{
	protected int base, height;
	
	public Sam() {
		System.out.println("Sam �⺻ ������");
		System.out.print("�غ� : ");
		base = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	//������̼�(@)
	@Override
	public void calcArea() {
		area = base * height / 2.0;
	}
	
	@Override
	public void disArea() {
		System.out.println("�ﰢ�� ���� = "+area);
	}
}


//�簢�� class
class Sa extends Shape{
	protected int base, height;
	
	public Sa() {
		System.out.println("Sa �⺻ ������");
		System.out.print("���� : ");
		base = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	//������̼�(@)
	@Override
	public void calcArea() {
		area = base * height; 
	}
	
	@Override
	public void disArea() {
		System.out.println("�簢�� ���� = "+area);
	}
}


//��ٸ��� class
class Sadari extends Shape{
	protected int top, height, bottom;
	
	public Sadari() {
		System.out.println("Sadari �⺻ ������");
		System.out.print("���� : ");
		top = scan.nextInt();
		System.out.print("�غ� : ");
		bottom = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	//������̼�(@)
	@Override
	public void calcArea() {
		area = (top+bottom)*height; 
	}
	
	@Override
	public void disArea() {
		System.out.println("��ٸ��� ���� = "+area);
	}
}


public class ShapeMain {

	public static void main(String[] args) {
//		Sam sam = new Sam();
//		sam.calcArea();
//		sam.disArea();
//		System.out.println();
//		Sa sa = new Sa();
//		sa.calcArea();
//		sa.disArea();
//		System.out.println();
//		Sadari sadari = new Sadari();
//		sadari.calcArea();
//		sadari.disArea();
		
		/*
		������
		�θ�Ŭ������ ��� �ڽ�Ŭ������ �����Ҽ� �ִ�
		���� ���� Ÿ���� ��ü�� �ϳ��� �ڷ� ���� �ȿ� ��Ƽ� ó���Ѵ�.
		*/
		Shape shape;
		shape = new Sam();
		shape.calcArea();
		shape.disArea();
		System.out.println();
		
		shape = new Sa();
		shape.calcArea();
		shape.disArea();
		System.out.println();
		
		shape = new Sadari();
		shape.calcArea();
		shape.disArea();
		System.out.println();
	}
}
