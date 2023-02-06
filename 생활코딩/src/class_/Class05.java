package class_;
class Kwon {
	public String delimiter = "";
	
	//생성자 method
	public Kwon(String delimiter){
		this.delimiter = delimiter; //this : 클레스가 인스턴스화 되었을때 인스턴스의 변수를 가리킨다.
	}
    public void A() {
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
 
    public void B() {
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
public class Class05 {
	
	public static void main(String[] args) {
	Kwon p1 = new Kwon("----"); //생성자
	p1.A();
	p1.A();
	p1.B();
	p1.B();
	 
	Kwon p2 = new Kwon("****");
	p2.A();
	p2.A();
	p2.B();
	p2.B();
	        
	p1.A();
	p2.A();
	p1.A();
	p2.A();
	}
	

}
//인스턴스 생성시부터 초기에 주입해야할값이 있어야할때 =>생성자메소드
//생성자메소드: 인스턴스명(or클래스명) 과 이름이 같은 메소드
//this. : 인스턴스 변수를 가리키는 특수한 단어

