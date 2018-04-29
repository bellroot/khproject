package ex18_2_1_Object;

import java.io.*;
import java.util.*;

public class ObjectOutputExample {
	public static void main(String args[]) {
	
		
		try(ObjectOutputStream  out= new ObjectOutputStream(new FileOutputStream("output.dat"))){
			
			//객체를 직렬화 하는 부분
			//writeObject 메소드 : 파리미터로 넘겨준 객체를 스트림으로 만들어서 출력하는 메소드
			//파리미터로 넘겨진 객체가 파일에 저장됩니다.
			//GregorianCalendar 객체를 생성해서 파일에 씁니다.
			out.writeObject(new GregorianCalendar(2018, 2, 5));
			out.writeObject(new GregorianCalendar(2018, 2, 6));
			out.writeObject(new GregorianCalendar(2018, 2, 7));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
