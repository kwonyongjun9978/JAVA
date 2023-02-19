package collection;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueMain {

	public static void main(String[] args) {
		String [] item = {"포르쉐", "페라리", "벤틀리"};
		
		LinkedList<String> q = new LinkedList<String>();
		
		for(String n : item) {
			q.offer(n); //offer() : 요소 추가
		}
		
		out.println("q의 크기 : "+q.size()+"\n");
		String data = "";
		
		while((data=q.poll())!=null) { //poll() : 맨 앞에 있는 값 반환 후 삭제, 비어있을 경우 null 반환
			out.println(data+"삭제!");
			out.println("q의 크기 : "+q.size()+"\n");
		}//while

	}

}
//Queue : FIFO
