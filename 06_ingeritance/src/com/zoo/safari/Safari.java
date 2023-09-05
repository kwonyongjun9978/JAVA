package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		
		Zoo z = new Zoo(); 
		z.tiger();
		//z.giraffe(); //Super클래스로 생성하면 접근이 안된다
		//z.elephant();
		//z.lion();
		
		Safari s = new Safari();
		s.tiger();
		s.giraffe();

	}

}
