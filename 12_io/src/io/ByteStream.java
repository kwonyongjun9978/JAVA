package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ByteStream {

	public static void main(String[] args) throws IOException {
			/*
			BufferedInputStream/BufferedOutputStream�� ��Ʈ���� ����� ȿ���� ���̱� ���� ���۸� ����ϴ� ������Ʈ���̴�. 
			�� ����Ʈ�� ������ϴ� �� ���ٴ� ���۸� �̿��ؼ� �� ���� ���� ����Ʈ�� ������ϴ� ���� ������ ������ ��κ��� ����� �۾��� ���ȴ�.
			*/
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
			int data;
			
			while( (data = bis.read()) != -1){  //read() : �ѱ��ھ� �д´�, �� �̻� �Է� ��Ʈ�����κ��� ����Ʈ�� ���� �� ���ٸ� -1�� return
				System.out.print((char)data+" ");
			}
			System.out.println();
	}

}
/*
enter
- ������ \n 13
- �� �� \r 10
 */

