package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		
		Zoo z = new Zoo(); 
		z.tiger();
		//z.giraffe(); //Super클래스로 생성하면 접근이 안된다
		//z.elephant();
		//z.lion();
		
		//자식클래스로 생성해야 내 위에 부모가 있는게 보인다, but부모 클래스로 생성하면 부모입장에서 내 밑에 있는게 안보인다.
		Safari s = new Safari();
		s.tiger();
		s.giraffe();

	}

}
