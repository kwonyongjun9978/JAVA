package method;

public class Method02 {

	public static void main(String[] args) {
                      //����, argument		
		printTwoTimes("a", "-");
		printTwoTimes("a", "*");
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
	}
	//method input                   �Ű�����,parameter   
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}