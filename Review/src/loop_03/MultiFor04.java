package loop_03;

public class MultiFor04 {

	public static void main(String[] args) {
		int i, j, k;
		for(i=2; i<9; i+=3) {
			for(j=1; j<=9; j++) {
				for(k=i; k<i+3; k++) {
					if(k == 10)break;
					System.out.print(k+"*"+j+"="+(k*j)+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
