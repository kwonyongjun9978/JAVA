package abstract_;

public class AbstractMain extends AbstractTest{

	@Override
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		//�߻�Ŭ������ ����������(�ڽ��� Ŭ������) �޸𸮿� ����(new)�Ҽ� ����
		AbstractTest at = new AbstractMain(); //at -> AbstractTest
		at.setName("ȫ�浿");
		System.out.println(at.getName());

	}

}

