package collection;

public class PersonDTO implements Comparable<PersonDTO> {
	private String name;
	private int age;
	
	public PersonDTO(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "\t" + age;
	}
	
	//Comparable 인터페이스의 compareTo 메소드 오버라이드
	@Override
	public int compareTo(PersonDTO dto) { //객체 비교(자기 자신과 매개변수 객체를 비교)
		// age로 오름차순
		if(this.age < dto.age) return -1;
		else if(this.age>dto.age) return 1;
		else return 0;
	}
}
