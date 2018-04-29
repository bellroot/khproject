package ex18_2_1_Object;

import java.io.*;
import java.util.GregorianCalendar;

public class ObjectInputExample {
	public static void main(String args[]) {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.dat"))) {  // 인터페이스 AutoCloseable를 반드시 implements 해야한다
			// 객체를 역직렬화 하는 부분
			// readObject 메소드 : 입력된 스트림으로 부터 객체를 만들어서 리턴하는 메소드.
			// 리턴타입(Object)
			// 리턴 타입 Object를 원래의 클래스 타입으로 사용하기 위해 캐스트 연산을 해야합니다.
			// readObject()가 Object형이므로 GregorianCalendar 타입으로 형 변환 됩니다.
			
			while(true) {
			GregorianCalendar calendar = (GregorianCalendar) in.readObject();
			
			int year = calendar.get(calendar.YEAR);
			int month = calendar.get(calendar.MONTH)+1;
			int date = calendar.get(calendar.DATE);
				System.out.println(year+"년"+month+"월"+date+"일");
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(EOFException e) {
			System.out.println("더이상 읽을 객체가 없습니다.");
		} catch (IOException e1) {
			System.out.println("파일을 읽을 수 없습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}
		
		
	}
}
