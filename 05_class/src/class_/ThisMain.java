package class_;

class This{
	private int b; //필드
	private static int c;
	
	public void setB(int b) { //인수(argument), 매개변수(parameter) / void : 반환값(return)이 없다
		System.out.println("this = "+this);
		 this.b = b; //this.b = class 필드 변수 
	}
	public int getB() {
		return this.b; //this는 생략가능
	}
	
	public void setC(int c) { //인수(argument), 매개변수(parameter) / void : 반환값(return)이 없다
		 this.c = c; //
	}
	public int getC() {
		return this.c; //this는 생략가능
	}
	
}

public class ThisMain {

	private int a; //필드, private
	
	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		tm.a=10;
		System.out.println("a = "+tm.a+"\n");
		
		//b에 20을 넣어서 출력하시오
		This t = new This();
		System.out.println("객체 t = "+t);
		t.setB(20); //호출 - 호출한 메소드는 반드시 돌아온다.
		System.out.println("b = "+t.getB());
		
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