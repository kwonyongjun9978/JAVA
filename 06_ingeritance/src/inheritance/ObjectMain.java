package inheritance;

class Test extends Object {
	
}

class Sample extends Object{
	@Override
	public String toString() {
		return getClass()+"@용준";
	}
}

class Exam extends Object{
	private String name = "권용준";
	private int age = 25;
	
	@Override
	public String toString() {
//		return super.toString();
		return name + "\t" + age;
	}
}

public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = "+t);//클래스명@16진수
		System.out.println("객체 t = "+t.toString());
		System.out.println("객체 t = "+t.hashCode()); //hashCode() : 주소의 값을 10진수로 변경
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = "+s.toString());
		System.out.println();
		
		Exam e = new Exam();
		System.out.println("객체 e = "+e.toString());
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa = "+aa);
		System.out.println("객체 aa = "+aa.toString()); // toString을 써도 문자열로 출력(주소X)
		System.out.println("객체 t = "+aa.hashCode());
		System.out.println();
		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb==cc : "+(bb==cc)); //주소 비교
		System.out.println("bb.equals(cc) : "+bb.equals(cc)); //문자열 비교
		System.out.println();
		
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd==ee : "+(dd==ee)); //주소 비교
		System.out.println("dd.equals(ee) : "+dd.equals(ee)); //주소 비교
		System.out.println();
		
		Object ff = new String(); //부모클래스가 자식클래스를 참조(부모 = 자식)
		Object gg = new String();
		System.out.println("ff==gg : "+(ff==gg)); //주소 비교
		System.out.println("ff.equals(gg) : "+ff.equals(gg)); //문자열 비교
		System.out.println();
		
	}

}
/*
class Object {
   public String toString() {}      	클래스명@16진수
   public int hashCode() {}      		10진수
   public boolean equals(Object ob){}   참조값 비교
}

class String extends Object
   public String toString() {}      		문자열
   public int hashCode() {}      			10진수 (믿으면 안된다) - 표기할 수 있는 문자열은 무한대이기 때문에 10진수로는 다 표기할 수 없다.
   public boolean equals(Object ob){}   	문자열 비교
}
*/
