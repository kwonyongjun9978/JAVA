package class_;
class Kwon {
	public String delimiter = "";
	
	//������ method
	public Kwon(String delimiter){
		this.delimiter = delimiter; //this : Ŭ������ �ν��Ͻ�ȭ �Ǿ����� �ν��Ͻ��� ������ ����Ų��.
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
	Kwon p1 = new Kwon("----"); //������
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
//�ν��Ͻ� �����ú��� �ʱ⿡ �����ؾ��Ұ��� �־���Ҷ� =>�����ڸ޼ҵ�
//�����ڸ޼ҵ�: �ν��Ͻ���(orŬ������) �� �̸��� ���� �޼ҵ�
//this. : �ν��Ͻ� ������ ����Ű�� Ư���� �ܾ�