package ex18_1_7_FileIO;

import java.io.*;

public class FileReaderExample {
	public static void main(String args[]) {
		char arr[] = new char[64];
		int cnt = 0;
		try (FileReader reader = new FileReader("output.txt"))	// *Close를 자동으로 시켜줌*
		{
//			reader = new FileReader("src\\ex17_1_3_FileIO\\거위의 꿈.txt");		//상대 경로
			while(true) {
				int data = reader.read(); // 파일에 있는 문자 하나를 읽어서 리턴하는 부분
				if (data == -1) // 더 이상 읽을 데이터가 없는경우
					break;
				char ch = (char) data;
				System.out.print(ch);

			}
			
					
			}catch (FileNotFoundException e) {
				System.out.println("파일이 존재하지 않습니다.");
			}catch (IOException e) {
				System.out.println("파일을 읽을 수 없습니다.");
			}catch (NullPointerException e) {
				System.out.println("NullPointerException 예외 발생");
			}
		
	
	}
}
