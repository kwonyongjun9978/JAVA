package class__;

import java.util.Scanner;

public class StringMain2_Test {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("���ڿ� �Է� : ");
        String original = scan.next();

        System.out.print("���� ���ڿ� �Է� : ");
        String current = scan.next();

        System.out.print("�ٲ� ���ڿ� �Է� : ");
        String after = scan.next();
        
        if(original.length() < current.length()) {
           System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�");
           System.out.println("ġȯ �� �� �����ϴ�");
           //return; //�Լ��� �����
           System.exit(0); //���α׷� ���� ����
        }
        
        original = original.toLowerCase();
        current = current.toLowerCase();
        
        int index = 0;
        int count = 0;
        
        while((index = original.indexOf(current, index)) != -1) {
           count++;
           index = index + current.length();   
        }//while
  
        System.out.println(original.replace(current, after));
        System.out.println(count + "�� ġȯ");
   }

}