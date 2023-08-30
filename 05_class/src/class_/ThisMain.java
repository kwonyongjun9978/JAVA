package class_;

class This{
	//필드
	private int b; 
	private static int c; 
	
	//메소드(setters,getters)
	//setters메소드에는 void 사용 -> 반환값(return)이 없다
	public void setB(int b) { //int b : 매개변수(parameter) : 메소드에 전달되는 값을 전달하는 변수
		System.out.println("this = "+this);
		 this.b = b; //this.b = class 필드 변수 
	}
	
	public int getB() {
		return this.b; //this는 생략가능
	}
	
	public void setC(int c) { 
		 this.c = c;
	}
	
	public int getC() {
		return this.c; //this는 생략가능
	}
	
}

public class ThisMain {

	private int a; //필드(인스턴스 변수)
	
	public static void main(String[] args) {
		ThisMain tm = new ThisMain(); //클래스 타입의 객체(tm)를 선언(클래스로부터 객체를 선언하는 과정을 클래스의 인스턴스 화)
									  //인스턴스(instance) : 선언된 해당 클래스 타입의 객체를 인스턴스(tm)라고 한다.
									  //즉, 인스턴스란 메모리에 할당된 객체를 의미.
		tm.a=10;
		System.out.println("객체 tm = "+tm);
		System.out.println("a = "+tm.a+"\n");
		
		//b에 20을 넣어서 출력하시오
		This t = new This();
		System.out.println("객체 t = "+t);
		t.setB(20); //20 : 인수(argument) / 호출 - 호출한 메소드는 반드시 돌아온다.
		System.out.println("b = "+t.getB());
		System.out.println();
		
		//c에 30을 넣어서 출력하시오
		t.setC(30);
		System.out.println("c = "+t.getC()+"\n");
		
		This w = new This();
		System.out.println("객체 w = "+w);
		w.setB(40);
		w.setC(50);
		System.out.println("b = "+w.getB());
		System.out.println("c = "+w.getC());
	}

}
//모든 클래스는 반드시 생성해야 한다.