package ex18_1_2_FileIO;

import java.io.*;

public class FileInputStreamExample {
	public static void main(String args[]) {
		if(args.length < 1) {
			System.out.println("���ϸ��� Arguments�ǿ� output1.dat�Է�");
			return;
		}
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(args[0]); // ������ ����
			out = new FileOutputStream("koala2.jpg");
			// Run -> Run Configurations���� �Ű����� ������  output1.dat �Է�
			
			byte readBytes[] = new byte[128]; // ����Ʈ ������ �����͸� �б� ������ byte
			while(true) {
				int num =  in.read(readBytes); //���Ϸκ��� 128����Ʈ�� �д´�
				int readCount;
				if(num < 0)
					break;
			
				
				/*for(int i  = 0 ; i < readBytes.length ; i++)
					out.write(readBytes[i]);*/
				
				
				// �ٸ� ǥ�� ���
				while((readCount = in.read(readBytes)) != -1) {
					out.write(readBytes);	//128����Ʈ�� ��� ��Ʈ������ �����ϴ�.
				
					// write(byte[] b, int off , int len)
					// out.write(readBytes , 0 , readCount);
					// �迭 readBytes[0]���� readCount��ŭ�� ����Ʈ�� ��� ��Ʈ������ �����ϴ�.
				}
				
			
				}
			}catch(Exception e) {
				
			}finally {
				try {
					in.close();
					out.close();
					System.out.println("���� �Ǿ����ϴ�.");
				} catch (Exception e) {
					System.out.println("����");
				}
			}
			
		
	}
}
