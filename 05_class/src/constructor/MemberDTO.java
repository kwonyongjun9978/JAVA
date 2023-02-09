package constructor;

public class MemberDTO { //Data Transfer Object
	private String name;
	private int age;
	private String phone;
	private String address;
	
	//생성자를 통해서 데이터 4개를 받아온다
	public MemberDTO(String name, int age, String phone, String address) {
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public String getAddress(){
		return address;
	}
	
}

