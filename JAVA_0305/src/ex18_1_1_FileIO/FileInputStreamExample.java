package ex18_1_1_FileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String args[]) {
		if(args.length < 1) {
			System.out.println("���ϸ��� Arguments�ǿ� output1.dat�Է�");
			return;
		}
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(args[0]); // ������ ����
			// Run -> Run Configurations���� �Ű����� ������  output1.dat �Է�
			
			byte arr[] = new byte[20]; // ����Ʈ ������ �����͸� �б� ������ byte
			while(true) {
				int num =  in.read(arr);
				
				if(num < 0)
					break;
				
				System.out.println("16���� ���");
				for(int cnt = 0 ; cnt < num ; cnt++)
					System.out.printf("%02X ",arr[cnt]);
				System.out.println();

				System.out.println("10���� ���");
				for(int cnt = 0 ; cnt < num ; cnt++)
					System.out.printf("%d ",arr[cnt]);
				System.out.println();
				
				System.out.println("8���� ���");
				for(int cnt = 0 ; cnt < num ; cnt++)
					System.out.printf("%o ",arr[cnt]);
			
				}
			}catch(Exception e) {
				
			}finally {
				try {
					in.close();
				} catch (Exception e) {
					System.out.println("����");
				}
			}
			
		
	}
}
