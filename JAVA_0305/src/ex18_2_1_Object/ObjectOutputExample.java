package ex18_2_1_Object;

import java.io.*;
import java.util.*;

public class ObjectOutputExample {
	public static void main(String args[]) {
	
		
		try(ObjectOutputStream  out= new ObjectOutputStream(new FileOutputStream("output.dat"))){
			
			//��ü�� ����ȭ �ϴ� �κ�
			//writeObject �޼ҵ� : �ĸ����ͷ� �Ѱ��� ��ü�� ��Ʈ������ ���� ����ϴ� �޼ҵ�
			//�ĸ����ͷ� �Ѱ��� ��ü�� ���Ͽ� ����˴ϴ�.
			//GregorianCalendar ��ü�� �����ؼ� ���Ͽ� ���ϴ�.
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
