package abstract_;

//�߻�Ŭ����(�����ϰ� �����Ǿ� ���� ���� �޼ҵ带 ������ �ִ� Ŭ����)
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
/*
�߻�޼ҵ带 ����� �߻�Ŭ������ ���ǵǾ�� �Ѵ�.
�߻� Ŭ������ ��ӹ޴� �ڽ� Ŭ���������� �ݵ�� �߻� �޼ҵ带 �������Ͽ��� �Ѵ�.(�߻�޼ҵ�� �ݵ�� Sub Class���� Override�� �� �� �־�� �Ѵ�, Override�� ���ϸ� Sub Class ������ abstract �� �Ǿ�� �Ѵ�)
�߻�Ŭ���� ���忡���� �߻�޼ҵ尡 �������� �ְ� �������� �ִ�.(���°�� �߻�Ŭ������ �޼ҵ�� ��� ��body�� �Ǿ��ִ�)
�߻�Ŭ������ ����������(�ڽ��� Ŭ������) �޸𸮿� ����(new)�Ҽ� ����(�߻� Ŭ������ ��ü����X)
=>�����Ϸ���
	     ��. Sub Class�� �̿�(�ݵ�� Sub Class�� �߻�޼ҵ带 Override �ؾ� �Ѵ�)
	     ��. �޼ҵ带 �̿�
*/