package method;

public class Method04 {
	//method 활용 : 코드의 가독성&재사용성&유지보수 ↑
	//공급가액
	public static double valueOfSupply = 10000.0;
	
	//부가가치세율
	public static double vatRate = 0.1;
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply+getVAT();
	}
	
	public static void main(String[] args) {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+getTotal());

	}

}