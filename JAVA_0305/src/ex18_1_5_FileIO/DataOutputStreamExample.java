package ex18_1_5_FileIO;

import java.io.*;
/*	DataOutputStream Ŭ������ ��� �� - ���ڿ� ����
	String Ÿ���� �����͸�*/

public class DataOutputStreamExample {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out =  new DataOutputStream(new FileOutputStream("output.dat"));
			
			//��¼����� String -> Int -> Double �̶��
			//�Է¼����� String -> Int -> Double �̾�� �Ѵ�
			out.writeUTF("��ſ� ������ �Դϴ�.~");
			out.writeInt(5);
			out.writeDouble(3.14);
		}
		catch(Exception e) {
			System.out.println("���Ϸ� ��� �� �� �����ϴ�.");
		}
		finally {
			try {
			if(out != null)
				out.close();
			System.out.println("output.dat ������ ����մϴ�.");
			}catch(Exception e)
			{
				
			}
			
		}
	
	}
}
