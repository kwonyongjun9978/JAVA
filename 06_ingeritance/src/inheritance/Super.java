package inheritance;

public class Super extends Object{
	protected double weight, height;
	
	Super(){
		System.out.println("Super�� �⺻ ������");
	}
	
	Super(double weight, double height){
		this.weight = weight;
		this.height = height;
	}
	
	public void disp() {
		System.err.println("������ = "+this.weight);
		System.err.println("Ű = "+height);
	}
}
