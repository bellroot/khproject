package ex18_2_2_Object;

import java.io.*;
import java.util.StringTokenizer;

public class ObjectOutputStreamExample {
	public static void main(String args[]) {
		System.out.println("***���α׷� ����***");
	/*	ObjectOutputStream out =null;
		FileOutputStream Fileout = null; */
		try (	FileOutputStream Fileout  = new FileOutputStream("output.dat"); 
				ObjectOutputStream out = new ObjectOutputStream(Fileout);){
	
		/*	Fileout = new FileOutputStream("output.dat"); 
			out = new ObjectOutputStream(Fileout);*/
			
			
			System.out.println("������ �������ϴ�.");
			out.writeObject(new StringTokenizer("a|b|c" , "|"));
			System.out.println("���Ϸ� StringTokenizer ��ü�� ����մϴ�");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		System.out.println("***���α׷� ��***");
	}
}
