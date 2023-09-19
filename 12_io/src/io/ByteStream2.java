package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) {
		try {
			File file = new File("data.txt");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			int size = (int)file.length(); //���� ũ��
			byte[] b = new byte[size];
			
			bis.read(b, 0, size);
			bis.close();
			System.out.println(new String(b)); //byte[] -> String ��ȯ
		} catch (IOException e) {		
			e.printStackTrace();
		}

	}

}
