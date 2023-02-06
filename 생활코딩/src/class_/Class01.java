package class_;

import java.io.FileWriter;
import java.io.IOException;

public class Class01 {

	public static void main(String[] args) throws IOException {
        // class : System, Math, FileWriter
        // instance : f1, f2 가 가리키는 값
         
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));
  
        
        //객체지향 프로그래밍 : Class 와 Instance 라는 구조화된 객체들을 성 처럼 쌓아 프로그램을 만드는 기법.
        //Class : 서로 연관된 Method와 Variable를 정리 정돈하여 객체화 한 것으로 일회성으로 사용.
        //Instance : 객체화 된 Class를 이용하여 서로 다른 Data를 가진 서로 같은 Method를 복제하여 사용.
        //class를 f1,f2로 인스턴스화한다
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");
         
         
        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();
         
        f1.write("!!!");
        f1.close();
	}

}