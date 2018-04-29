package ex18_1_3_FileIO;

import java.io.*;

public class DataInputStreamExample {
	public static void main(String args[]) {
		DataInputStream in = null;
		
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));
			
			// 파일로부터 정수를 읽어서 출력한다.
			while(true) {
				//데이터를 읽다가 파일 끝을 만나면 EOFException이 발생합니다.
				int data = in.readInt();
				System.out.println(data);
			}
			
			
		}catch(FileNotFoundException e){
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(EOFException e) {
			System.out.println("끝"); //readInt()메소드에 의해 파일의 끝에 도달하여 이곳으로 이동
		}catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
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
