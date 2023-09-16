package collection_10;

class Student implements Comparable<Student> {
	 
	int age;			// ����
	int classNumber;	// �б�
	
	Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
}
