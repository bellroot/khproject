package ex18_2_2_Object;

import java.io.*;
import java.util.StringTokenizer;

public class ObjectOutputStreamExample {
	public static void main(String args[]) {
		System.out.println("***프로그램 시작***");
	/*	ObjectOutputStream out =null;
		FileOutputStream Fileout = null; */
		try (	FileOutputStream Fileout  = new FileOutputStream("output.dat"); 
				ObjectOutputStream out = new ObjectOutputStream(Fileout);){
	
		/*	Fileout = new FileOutputStream("output.dat"); 
			out = new ObjectOutputStream(Fileout);*/
			
			
			System.out.println("파일을 열었습니다.");
			out.writeObject(new StringTokenizer("a|b|c" , "|"));
			System.out.println("파일로 StringTokenizer 객체를 출력합니다");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		System.out.println("***프로그램 끝***");
	}
}
