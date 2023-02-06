package class_;

import java.io.FileWriter;
import java.io.IOException;

public class Class01 {

	public static void main(String[] args) throws IOException {
        // class : System, Math, FileWriter
        // instance : f1, f2 �� ����Ű�� ��
         
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));
  
        
        //��ü���� ���α׷��� : Class �� Instance ��� ����ȭ�� ��ü���� �� ó�� �׾� ���α׷��� ����� ���.
        //Class : ���� ������ Method�� Variable�� ���� �����Ͽ� ��üȭ �� ������ ��ȸ������ ���.
        //Instance : ��üȭ �� Class�� �̿��Ͽ� ���� �ٸ� Data�� ���� ���� ���� Method�� �����Ͽ� ���.
        //class�� f1,f2�� �ν��Ͻ�ȭ�Ѵ�
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