package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	public static void main(String[] args) {
		String[] groupA = {"���Ű��ź", "�����Ʈ", "����", "���ѹα�"};
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++) {
			stack.push(groupA[i]); //push() : �־��� ��ü�� ���ÿ� �ִ´�.
		}
		
		while(!stack.isEmpty()) { //isEmpty() : �÷��� �������̽��� �޼ҵ�, ���� �����̸� true ��ȯ
			out.println(stack.pop()); //pop() : ������ �� �� ��ü�� �����´�, ��ü�� ���ÿ��� �����Ѵ�.
		}

	}

}
//stack : LIFO
