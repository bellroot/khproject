package ex18_1_5_FileIO;

import java.io.*;

public class DataInputStreamExample {
	public static void main(String args[]) {
		DataInputStream in = null;
		String data;
		int data1;
		double data2;
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));
			
			// ���Ϸκ��� ������ �о ����Ѵ�.
			
				data = in.readUTF();
				System.out.println(data);
				data1 = in.readInt();
				System.out.println(data1);
				data2 = in.readDouble();
				System.out.println(data2);
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch(EOFException e) {
			System.out.println("��"); //read()�޼ҵ忡 ���� ������ ���� �����Ͽ� �̰����� �̵�
		}catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}finally {
			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
