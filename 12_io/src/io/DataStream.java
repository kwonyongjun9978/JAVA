package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		try {
			//���� ���
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			
//			FileOutputStream fos = new FileOutputStream("result.txt");
//			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("ȫ�浿");
			dos.writeInt(25);
			dos.writeDouble(185.3);
			
			dos.close();
		
			
			//���� �б�
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			
			System.out.println("�̸� = "+name);
			System.out.println("���� = "+age);
			System.out.println("Ű = "+height);
			
//		} catch(FileNotFoundException e){
//			e.printStackTrace();
		}//try
		catch(IOException e) {
			e.printStackTrace();
		}//catch
	}//method
}//class

