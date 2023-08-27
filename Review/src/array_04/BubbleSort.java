package array_04;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {32,40,25,78,56};
		
		for(int i=0; i<ar.length; i++){
			System.out.print(String.format("%4d", ar[i]));
		}
		System.out.println();
		
		//오름차순(ASCENDING)
		int temp;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d", ar[i]));
		}
		
		System.out.println();
		
		
		//내림차순(DESCENDING)
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[j]<ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d", ar[i]));
		}
	}

}
