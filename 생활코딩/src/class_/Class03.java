package class_;
class Jun {
	public String delimiter = "";
    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
 
    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
public class Class03 {
	
	public static void main(String[] args) {
	 Jun p1 = new Jun();
	 p1.delimiter = "----";
	 p1.A();
	 p1.A();
	 p1.B();
	 p1.B();
	 
	 Jun p2 = new Jun();
	 p2.delimiter = "****";
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

