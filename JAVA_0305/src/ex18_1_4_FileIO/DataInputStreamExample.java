package ex18_1_4_FileIO;

import java.io.*;

public class DataInputStreamExample {
	public static void main(String args[]) {
		DataInputStream in = null;
		
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));
			
			// ���Ϸκ��� ������ �о ����Ѵ�.
			while(true) {
				String data = in.readUTF();
				System.out.println(data);
			}
			
			
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
