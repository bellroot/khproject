package ex18_2_3_Object;

import java.io.*;

public class BufferInputStreamExample {
	public static void main(String args[]) {
		if(args.length < 1) {
			System.out.println("파일명을 Arguments탭에 output1.dat입력");
			return;
		}
		
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(args[0]))){
			// Run -> Run Configurations에게 매개변수 값으로  output1.dat 입력
			
			byte arr[] = new byte[20]; // 바이트 단위로 데이터를 읽기 때문에 byte
			while(true) {
				int num =  in.read(arr);
				
				if(num < 0)
					break;
				System.out.println("16진수 출력");
				for(int cnt = 0 ; cnt < num ; cnt++)
					System.out.printf("%02X ",arr[cnt]);
				System.out.println();

			
				}
			}catch(Exception e) {
				
			}
			
		
	}
}
