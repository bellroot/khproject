package ex18_1_5_FileIO;

import java.io.*;
/*	DataOutputStream 클래스를 사용 예 - 문자열 쓰기
	String 타입의 데이터를*/

public class DataOutputStreamExample {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out =  new DataOutputStream(new FileOutputStream("output.dat"));
			
			//출력순서가 String -> Int -> Double 이라면
			//입력순서도 String -> Int -> Double 이어야 한다
			out.writeUTF("즐거운 월요일 입니다.~");
			out.writeInt(5);
			out.writeDouble(3.14);
		}
		catch(Exception e) {
			System.out.println("파일로 출력 할 수 없습니다.");
		}
		finally {
			try {
			if(out != null)
				out.close();
			System.out.println("output.dat 파일을 출력합니다.");
			}catch(Exception e)
			{
				
			}
			
		}
	
	}
}
