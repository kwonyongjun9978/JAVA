package inheritance;

class AA{
	public int a =3;
	public void disp() {
		a += 5;
		System.out.println("AA : "+ a + " ");
	}
}
//-----------------
class BB extends AA{
	//�ʵ�� Override ������ ����, �޼ҵ忡�� �ش��Ѵ�
	public int a =8;
	
	@Override
	public void disp() {
		this.a+=5;
		System.out.println("BB : "+ a + " ");
	}
}
public class OverrideMain {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp(); //BB : 13
		System.out.println("aa : "+aa.a); //13
		System.out.println();
		
		AA bb = new BB();
		bb.disp(); //BB : 13
		System.out.println("bb : "+bb.a); //3
		System.out.println();
		
		BB cc = (BB)bb; //�ڽ� = (�ڽ�)�θ�
		cc.disp();//BB : 18
		System.out.println("cc : "+cc.a); //18
		System.out.println();
		
		AA dd = new AA();
		dd.disp();
		System.out.println("dd : "+dd.a); 
		System.out.println();

	}

}
