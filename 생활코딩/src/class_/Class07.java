package class_;

	class Accounting1{
		public double valueOfSupply;
			
		public static double vatRate = 0.1;
		
		public Accounting1(double valueOfSupply){
			this.valueOfSupply = valueOfSupply;
		}
		
		public double getVAT() {
			return valueOfSupply*vatRate;
		}
			
		public double getTotal() {
			return valueOfSupply+getVAT();
		}
	}
	public class Class07 {
		public static void main(String[] args) {
			Accounting1 a1 = new Accounting1(10000.0);

			Accounting1 a2 = new Accounting1(20000.0);
			
			System.out.println("Value of supply : " + a1.valueOfSupply);
		    System.out.println("Value of supply : " + a2.valueOfSupply);
		     
		    System.out.println("VAT : " + a1.getVAT());
		    System.out.println("VAT : " + a2.getVAT());
		         
		    System.out.println("Total : " + a1.getTotal());
		    System.out.println("Total : " + a2.getTotal());
		         

		}
	}







