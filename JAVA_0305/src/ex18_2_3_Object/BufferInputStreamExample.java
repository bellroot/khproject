package ex18_2_3_Object;

import java.io.*;

public class BufferInputStreamExample {
	public static void main(String args[]) {
		if(args.length < 1) {
			System.out.println("���ϸ��� Arguments�ǿ� output1.dat�Է�");
			return;
		}
		
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(args[0]))){
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

			
				}
			}catch(Exception e) {
				
			}
			
		
	}
}
