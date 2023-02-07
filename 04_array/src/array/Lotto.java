package array;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto= new int[6];
		//랜덤번호 생성
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			//중복번호 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		//오름차순 정렬
		for(int i=0; i<lotto.length; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(String.format("%4d",lotto[i])); 
		

	}

}
}

/*
[문제] 로또 - 자동
- 크기가 6개인 배열 생성
- 1 ~ 45 사이의 난수 발생
- 숫자는 오름차순하여 출력(Selection Sort)
- 출력시 자리수는 5자리로 지정
- 중복 숫자가 나오면 안된다

[실행결과]
 2 4 19 39 43 44
 */
