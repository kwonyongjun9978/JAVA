package class__;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str="학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ","); //비어있는 값은 가져오지 않는다
		System.out.println("토큰 개수 = "+st.countTokens());
		
		while(st.hasMoreTokens()) { //토큰 있다?(true) 없다?(false)
			System.out.println(st.nextToken()); //토큰을 꺼내고 다음 토큰으로 이동
		} //while
		System.out.println("--------------------------");
		
		String[] ar = str.split(","); //비어있는 값도 가져온다 
		
		for(String data : ar) {
			System.out.println(data);
		}
	}

}
