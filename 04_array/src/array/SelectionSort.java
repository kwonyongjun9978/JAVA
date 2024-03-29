package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {32,40,25,78,56};
		
		//출력
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); //4자리 출력
		}
		System.out.println();
		
		/*
		Sort(정렬)
		오름차순
		sort 메소드의 변수는 정수형 배열로 들어가고 반환값은 없다(static void)
		Arrays.sort(ar);
		System.out.println(ar[0]+","+ar[1]+","+ar[2]+","+ar[3]+","+ar[4]);
		*/
		
		//sort메소드를 쓰지말고 직접구성해보자!
		//오름차순(ASCENDING)
		int tmp;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
					
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); 
		}
		
		//내림차순(DESCENDING)
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
					
				}
			}
		}
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); 
		}
	}

}
/*
선택 정렬은 첫 번째 자료를 두 번째 자료부터 마지막 자료까지 차례대로 비교하여 가장 작은 값을 찾아 첫 번째에 놓고, 두 번째 자료를 세 번째 자료부터 마지막 자료까지와 차례대로 비교하여 그 중 가장 작은 값을 찾아 두 번째 위치에 놓는 과정을 반복하며 정렬을 수행한다.
1회전을 수행하고 나면 가장 작은 값의 자료가 맨 앞에 오게 되므로 그 다음 회전에서는 두 번째 자료를 가지고 비교한다. 마찬가지로 3회전에서는 세 번째 자료를 정렬한다.
*/