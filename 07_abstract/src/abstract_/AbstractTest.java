package abstract_;

public abstract class AbstractTest { //POJO(Plain Old Java Object) - �⺻���� ����
	protected String name;

	public AbstractTest() {
		
	}

	public AbstractTest(String name) {
		super();
		this.name = name;
	}


	public String getName() { //�޼ҵ� ����
		return name;
	}

	public abstract void setName(String name); //�߻�޼ҵ�
											   
	
}
//�߻�޼ҵ带 ����� �߻�Ŭ������ ���ǵǾ�� �Ѵ�.
//�߻�Ŭ���� ���忡���� �߻�޼ҵ尡 �������� �ְ� �������� �ִ�.
