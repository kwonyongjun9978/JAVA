package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		
		Zoo z = new Zoo(); 
		z.tiger();
		//z.giraffe(); //SuperŬ������ �����ϸ� ������ �ȵȴ�
		//z.elephant();
		//z.lion();
		
		Safari s = new Safari();
		s.tiger();
		s.giraffe();

	}

}
