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
		System.out.println("������ = "+this.weight);
		System.out.println("Ű = "+height);
	}
}
