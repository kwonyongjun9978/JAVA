package nested;

public class AbstractMain {
	
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() { //�͸� ���� Ŭ����
			
			public void setName(String name) { //����
				this.name = name;
			}
		};
		
		InterA in = new InterA() { //�͸� ���� Ŭ����, interface�� new��Ų�� �ƴ϶� �͸� ���� Ŭ������ ����Ŵ�.
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() { //�͸� ���� Ŭ����
			//�߻�޼ҵ尡 ���� ������ ���ϴ� �޼ҵ带 ��� Override
		};
		
	}

}

//�߻�Ŭ���� ����
//1. ��� - �ڽ�Ŭ������ �̿��Ͽ� ����
//2. �޼ҵ带 �̿��Ͽ� ����
