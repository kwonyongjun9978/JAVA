package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++) {
			stack.push(groupA[i]); //push() : 주어진 객체를 스택에 넣는다.
		}
		
		while(!stack.isEmpty()) {
			out.println(stack.pop()); //pop() : 스택의 맨 위 객체를 가져온다, 객체를 스택에서 제거한다.
		}

	}

}
//stack : LIFO
