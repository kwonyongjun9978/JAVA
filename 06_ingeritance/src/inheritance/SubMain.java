package inheritance;

public class SubMain extends Super{
	private String name;
	private int age;
	
	SubMain(){
		System.out.println("SubMain의 기본 생성자");
	}
	SubMain(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
		super.weight = weight; //this.weight = weight;
		super.height = height;
	}
	public void output() {
		System.err.println("이름 = "+name);
		System.err.println("나이 = "+age);
		super.disp(); //this.disp();
	}

	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 25, 73.5, 182.6);
		aa.disp(); //부모 메소드 호출
		System.out.println("-----------------");
		aa.output();
		System.out.println("-----------------");
		
		Super bb = new SubMain("코난", 13, 53.5, 156.6);
//		bb.output(); //error(침조변수 bb는 Super클래스를 참조하기 때문이다)
		bb.disp();
	}

}

/*
자식클래스는 메모리 생성할 때 
1.부모 클래스 생성 / new 부모() <- 기본 생성자
2.자식 클래스 생성 / new 자식()
*/