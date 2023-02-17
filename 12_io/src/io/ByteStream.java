package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ByteStream {

	public static void main(String[] args) throws IOException {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
			int data;
			
			while( (data = bis.read()) != -1){  //read() : 한글자씩 읽는다
				System.out.print((char)data+" ");
			}
			System.out.println();
			
			

	}

}
/*
enter
- 다음줄 \n 13
- 맨 앞 \r 10
 */

