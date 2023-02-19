package abstract_;

public class AbstractMain extends AbstractTest{

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		//sub class를 이용하여 생성
		AbstractTest at = new AbstractMain(); //부모 = 자식
		at.setName("홍길동");
		System.out.println(at.getName());

	}

}

