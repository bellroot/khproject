package ex18_1_4_FileIO;

import java.io.*;
/*	DataOutputStream Ŭ������ ��� �� - ���ڿ� ����
	String Ÿ���� �����͸�*/

public class DataOutputStreamExample {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out =  new DataOutputStream(new FileOutputStream("output.dat"));
			
			out.writeUTF("��ſ� ������ �Դϴ�.~");
			
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
