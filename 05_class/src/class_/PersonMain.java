package class_;

class Person{
	//private : �ش� class �ȿ����� ����
	private String name; //�ʵ�, �ʱⰪ : null
	private int age; //�ʵ�, �ʱⰪ : 0
	
	//method ����
	public void setName(String n){
		this.name=n;
	}
	
	public void setAge(int a) {
		age=a;
	}
	
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	
	public void setData() {
		
	}
	
	public String getName(){
		return name; //��ȯ��
	}
	
	public int getAge(){
		return age; //��ȯ��
	}
	
}
public class PersonMain {

	public static void main(String[] args) {
		
		Person a; //��ü ����(class�� ����=��������)
		a = new Person(); //����, �޸��� heap������ ����(�̸��ο�X, �ּ�O)
		
		System.out.println("��ü a = "+a); //�ּ�
		a.setName("�ǿ���"); //ȣ�� - ȣ���� �Լ��� �ݵ�� ���ڸ��� ���ƿ´�.
		a.setAge(30); //ȣ��
		System.out.println("�̸� = "+a.getName()+"  ���� = "+a.getAge());
		
		Person b = new Person();
		System.out.println("��ü b = "+b);
		
		b.setName("���ǿ�"); 
		b.setAge(33); 
		System.out.println("�̸� = "+b.getName()+"  ���� = "+b.getAge());
		
		Person c = new Person();
		System.out.println("��ü c = "+c);
		c.setData("", 100); 
		System.out.println("�̸� = "+c.getName()+"  ���� = "+c.getAge());
		
		Person d = new Person();
		d.setData();
		System.out.println("�̸� = "+d.getName()+"  ���� = "+d.getAge());
	}

}
