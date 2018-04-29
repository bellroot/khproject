package ex18_1_7_FileIO;

import java.io.*;

public class FileReaderExample {
	public static void main(String args[]) {
		char arr[] = new char[64];
		int cnt = 0;
		try (FileReader reader = new FileReader("output.txt"))	// *Close�� �ڵ����� ������*
		{
//			reader = new FileReader("src\\ex17_1_3_FileIO\\������ ��.txt");		//��� ���
			while(true) {
				int data = reader.read(); // ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �κ�
				if (data == -1) // �� �̻� ���� �����Ͱ� ���°��
					break;
				char ch = (char) data;
				System.out.print(ch);

			}
			
					
			}catch (FileNotFoundException e) {
				System.out.println("������ �������� �ʽ��ϴ�.");
			}catch (IOException e) {
				System.out.println("������ ���� �� �����ϴ�.");
			}catch (NullPointerException e) {
				System.out.println("NullPointerException ���� �߻�");
			}
		
	
	}
}
