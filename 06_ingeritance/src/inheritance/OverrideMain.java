package inheritance;

class AA{
	public int a =3;
	
	AA(){
		System.out.println("�θ�Ŭ������ �⺻ ������");
	}
	
	public void disp() {
		this.a += 5;
		System.out.println("AA : "+ a + " ");
	}
}

class BB extends AA{
	//�ʵ�� Override ������ ����, �޼ҵ忡�� �ش��Ѵ�
	public int a =8;
	
	BB(){
		System.out.println("�ڽ�Ŭ������ �⺻ ������");
	}
	
	@Override
	public void disp() {
//		super.disp();
		this.a+=5;
		System.out.println("BB : "+ a + " ");
//		super.disp();
	}
}
public class OverrideMain {

	public static void main(String[] args) {
		BB aa = new BB(); //AAŬ������ BBŬ���� �޼ҵ�,�ʵ� ��� ��� ����(AAŬ������ �޼ҵ�,�ʵ� private����)
		aa.disp(); //BB : 13, �������̵��� �ڽ� �޼ҵ� ȣ��
		System.out.println("aa : "+aa.a); 
		System.out.println();
		
		/*��ĳ����(�θ� = �ڽ�)
		�θ� Ŭ���� ������ ������ �ڽ� Ŭ������ ��ü�� �����ϴ� ��쿡�� �θ� Ŭ�������� ���ǵ� �κи� ����� �� �ִ�.
		�ڽ� Ŭ����(BB) �߿��� �θ� Ŭ����(AA)�κ��� ��ӹ��� �κ�(disp())���� bb�� ���ؼ� ����� �� �ְ� �������� ������� ���Ѵ�.(�θ� Ŭ����(AA)�� �޼ҵ� �ʵ� ���)
		 */
		AA bb = new BB();   
		bb.disp(); //BB : 13
		System.out.println("bb : "+bb.a); //3
		System.out.println();
		
		//�ٿ�ĳ����( �ڽ� = �θ�, �θ� ��ü�� �ڽ� ���� ������ ����(error) -> �ڽ� = (�ڽ�)�θ� )
		BB cc = (BB)bb; //�ڽ� = (�ڽ�)�θ�
		cc.disp();//BB : 18 //������ ��ĳ������ ���� ��ü�� �����Ǿ a ���� 13���� �������� �ٽ� BBŬ������ disp()�� ȣ��
		System.out.println("cc : "+cc.a); //18
		System.out.println();
		
		AA dd = new AA();
		dd.disp();
		System.out.println("dd : "+dd.a); 
		System.out.println();
		
		//instanceof : ��ü Ÿ�� Ȯ��, ��ȯ��:true,false
		if(dd instanceof AA) System.out.println("ddd");

	}

}
/*
Override �޼ҵ�
SuperŬ������ SubŬ������ �Ȱ��� �޼ҵ尡 ����
��� �켱���� SubŬ������ ���´�.
Super, Sub Ŭ������ ����������(Modifier)�� Ʋ���� ������
Super���� SubŬ������ ����������(Modifier)�� �� Ŀ���Ѵ�.
*/
