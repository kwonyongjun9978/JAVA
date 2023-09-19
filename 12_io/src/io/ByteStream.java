package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ByteStream {

	public static void main(String[] args) throws IOException {
			/*
			BufferedInputStream/BufferedOutputStream은 스트림의 입출력 효율을 높이기 위해 버퍼를 사용하는 보조스트림이다. 
			한 바이트씩 입출력하는 것 보다는 버퍼를 이용해서 한 번에 여러 바이트를 입출력하는 것이 빠르기 때문에 대부분의 입출력 작업에 사용된다.
			*/
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
			int data;
			
			while( (data = bis.read()) != -1){  //read() : 한글자씩 읽는다, 더 이상 입력 스트림으로부터 바이트를 읽을 수 없다면 -1을 return
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

