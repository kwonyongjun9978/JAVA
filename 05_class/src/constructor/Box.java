package constructor;

public class Box {

	int width, height, depth;
	public Box(int w, int h, int d) {
		width=w;
		height=h;
		depth=d;
	}
	public static void main(String[] args) {
		Box b = new Box(4,5,6);
		

	}

}
//매개변수가 있는 생성자 하나가 선언되어 있으면 객체가 new연산자로 생성될 때 동일한 타입의 매개변수가 있어야한다.
