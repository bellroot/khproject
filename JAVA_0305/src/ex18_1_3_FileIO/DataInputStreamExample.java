package ex18_1_3_FileIO;

import java.io.*;

public class DataInputStreamExample {
	public static void main(String args[]) {
		DataInputStream in = null;
		
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));
			
			// ���Ϸκ��� ������ �о ����Ѵ�.
			while(true) {
				//�����͸� �дٰ� ���� ���� ������ EOFException�� �߻��մϴ�.
				int data = in.readInt();
				System.out.println(data);
			}
			
			
		}catch(FileNotFoundException e){
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch(EOFException e) {
			System.out.println("��"); //readInt()�޼ҵ忡 ���� ������ ���� �����Ͽ� �̰����� �̵�
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
