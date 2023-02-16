package class__;

class Fruit{ //1�κ�
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar;
	
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	
	public void calcTot() {
		tot = (jan+feb+mar);
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	
	public void display() {
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
	}
	
	public static void output() {
		System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
}

public class FruitMain {

	public static void main(String[] args) {
		System.out.println("------------------------------------");
		System.out.println("pum\tjan\tfeb\tmar\ttot");
		System.out.println("------------------------------------");
		Fruit[] ar = {new Fruit("���", 100, 80, 75), 
					  new Fruit("����", 30, 25, 10),
					  new Fruit("����", 25, 30, 90)};
		for(Fruit data :ar) {
			data.calcTot();
			data.display();
		}
		System.out.println("------------------------------------");
		Fruit.output();
		
		/*
		Fruit[] ar = new Fruit[3]; //��ü �迭
		
		System.out.println("------------------------------------");
		System.out.println("pum\tjan\tfeb\tmar\ttot");
		System.out.println("------------------------------------");
		
		ar[0]= new Fruit("���", 100, 80, 75);
		ar[0].calcTot();
		ar[0].display();
		
		ar[1]= new Fruit("����", 30, 25, 10);
		ar[1].calcTot();
		ar[1].display();
		
		ar[2]= new Fruit("����", 25, 30, 90);
		ar[2].calcTot();
		ar[2].display();
		
		System.out.println("------------------------------------");
		Fruit.output();
		*/
	}

}
/*
���� �Ǹŷ� ���ϱ�
���� �����հ赵 ���Ͻÿ�

Ŭ���� : Fruit
�ʵ�  : pum, jan, feb, mar, tot
      sumJan, sumFeb, sumMar

�޼ҵ� : ������(ǰ��, 1��, 2��, 3��)
	  calcTot()
 	  display()
      public static void output()

Ŭ���� : FruitMain

[������]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
���    100    80    75     255
����     30    25    10     65
����     25    30    90     145
---------------------------------
      xxx   xxx   xxx            output()�� ó��
*/
