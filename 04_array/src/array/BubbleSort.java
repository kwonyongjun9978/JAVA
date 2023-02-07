package array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {32,40,25,78,56};
		
		//���
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); //4�ڸ� ���
		}
		System.out.println();
		
		//��������(ASCENDING)
		int tmp;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[j]>ar[j+1]) {
					tmp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=tmp;
					
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); 
		}
		
		//��������(DESCENDING)
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[j]<ar[j+1]) {
					tmp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=tmp;
					
				}
			}
		}
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); 
		}
	}

}
