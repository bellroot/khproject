package ex18_2_1_Object;

import java.io.*;
import java.util.GregorianCalendar;

public class ObjectInputExample {
	public static void main(String args[]) {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.dat"))) {  // �������̽� AutoCloseable�� �ݵ�� implements �ؾ��Ѵ�
			// ��ü�� ������ȭ �ϴ� �κ�
			// readObject �޼ҵ� : �Էµ� ��Ʈ������ ���� ��ü�� ���� �����ϴ� �޼ҵ�.
			// ����Ÿ��(Object)
			// ���� Ÿ�� Object�� ������ Ŭ���� Ÿ������ ����ϱ� ���� ĳ��Ʈ ������ �ؾ��մϴ�.
			// readObject()�� Object���̹Ƿ� GregorianCalendar Ÿ������ �� ��ȯ �˴ϴ�.
			
			while(true) {
			GregorianCalendar calendar = (GregorianCalendar) in.readObject();
			
			int year = calendar.get(calendar.YEAR);
			int month = calendar.get(calendar.MONTH)+1;
			int date = calendar.get(calendar.DATE);
				System.out.println(year+"��"+month+"��"+date+"��");
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}catch(EOFException e) {
			System.out.println("���̻� ���� ��ü�� �����ϴ�.");
		} catch (IOException e1) {
			System.out.println("������ ���� �� �����ϴ�.");
		}catch(ClassNotFoundException e) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		}
		
		
	}
}
