package ex18_1_3_FileIO;

import java.io.*;
/*
DataOutputStream 클래스를 사용 예
	DataOutputStream 클래스는 기본형 데이터를 바이트 스트림으로 만들어서
	출력하는 기능의 클래스입니다
	이 클래스는 파일에 데이터를 쓰는 기능은 없기 때문에
	FileOutputStream 클래스와 함께 사용해야
	기본형 데이터를 파일에 쓸 수 있습니다.
	사용법은 먼저 FileOutputStream 객체를 생성한 후
	그 객체를 생성자 파라미터로 넘겨야 합니다.
*/
public class DataOutputStreamExample {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out =  new DataOutputStream(new FileOutputStream("output.dat"));
			
			int arr[] = {0, 1,2,3,4,5,6,7,8,9};
			for(int cnt = 0 ; cnt < arr.length ; cnt++)
				out.writeInt(arr[cnt]); // 파일에 int타일 데이터를 씁니다.
			
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
