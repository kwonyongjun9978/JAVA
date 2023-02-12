package inheritance;

public class ChildMain extends Super {
	private String name;
	private int age;
	
	ChildMain(){
		System.out.println("ChildMain의 기본 생성자");
	}
	ChildMain(String name, int age, double weight, double height){
		super(weight,height); //부모 생성자 호출
		
		this.name = name;
		this.age = age;
//		super.weight = weight; //this.weight = weight;
//		super.height = height;
	}
	
	public void disp() {
		System.err.println("이름 = "+name);
		System.err.println("나이 = "+age);
		super.disp(); 
	}
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 25, 73.5, 182.6);
		aa.disp();
		System.out.println("-----------------");
		
		Super bb = new ChildMain("코난", 13, 53.5, 156.6);
		bb.disp(); //Override(부모클래스와 자식클래스에 같은 메소드 존재)
				   //모든 우선권은 자식클래스가 갖는다.

	}

}
