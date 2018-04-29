package ex18_1_2_FileIO;

import java.io.*;

public class FileInputStreamExample {
	public static void main(String args[]) {
		if(args.length < 1) {
			System.out.println("파일명을 Arguments탭에 output1.dat입력");
			return;
		}
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(args[0]); // 파일을 연다
			out = new FileOutputStream("koala2.jpg");
			// Run -> Run Configurations에게 매개변수 값으로  output1.dat 입력
			
			byte readBytes[] = new byte[128]; // 바이트 단위로 데이터를 읽기 때문에 byte
			while(true) {
				int num =  in.read(readBytes); //파일로부터 128바이트를 읽는다
				int readCount;
				if(num < 0)
					break;
			
				
				/*for(int i  = 0 ; i < readBytes.length ; i++)
					out.write(readBytes[i]);*/
				
				
				// 다른 표현 방법
				while((readCount = in.read(readBytes)) != -1) {
					out.write(readBytes);	//128바이트를 출력 스트림으로 보냅니다.
				
					// write(byte[] b, int off , int len)
					// out.write(readBytes , 0 , readCount);
					// 배열 readBytes[0]부터 readCount만큼의 바이트를 출력 스트림으로 보냅니다.
				}
				
			
				}
			}catch(Exception e) {
				
			}finally {
				try {
					in.close();
					out.close();
					System.out.println("복사 되었습니다.");
				} catch (Exception e) {
					System.out.println("종료");
				}
			}
			
		
	}
}
