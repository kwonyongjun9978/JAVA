package collection;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueMain {

	public static void main(String[] args) {
		String [] item = {"������", "���", "��Ʋ��"};
		
		LinkedList<String> q = new LinkedList<String>();
		
		for(String n : item) {
			q.offer(n); //offer() : ��� �߰�
		}
		
		out.println("q�� ũ�� : "+q.size()+"\n");
		String data = "";
		
		while((data=q.poll())!=null) { //poll() : �� �տ� �ִ� �� ��ȯ �� ����, ������� ��� null ��ȯ
			out.println(data+"����!");
			out.println("q�� ũ�� : "+q.size()+"\n");
		}//while

	}

}
//Queue : FIFO
