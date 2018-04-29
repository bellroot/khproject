package ex18_1_3_FileIO;

import java.io.*;
/*
DataOutputStream Ŭ������ ��� ��
	DataOutputStream Ŭ������ �⺻�� �����͸� ����Ʈ ��Ʈ������ ����
	����ϴ� ����� Ŭ�����Դϴ�
	�� Ŭ������ ���Ͽ� �����͸� ���� ����� ���� ������
	FileOutputStream Ŭ������ �Բ� ����ؾ�
	�⺻�� �����͸� ���Ͽ� �� �� �ֽ��ϴ�.
	������ ���� FileOutputStream ��ü�� ������ ��
	�� ��ü�� ������ �Ķ���ͷ� �Ѱܾ� �մϴ�.
*/
public class DataOutputStreamExample {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out =  new DataOutputStream(new FileOutputStream("output.dat"));
			
			int arr[] = {0, 1,2,3,4,5,6,7,8,9};
			for(int cnt = 0 ; cnt < arr.length ; cnt++)
				out.writeInt(arr[cnt]); // ���Ͽ� intŸ�� �����͸� ���ϴ�.
			
		}
		catch(Exception e) {
			System.out.println("���Ϸ� ��� �� �� �����ϴ�.");
		}
		finally {
			try {
			if(out != null)
				out.close();
			System.out.println("output.dat ������ ����մϴ�.");
			}catch(Exception e)
			{
				
			}
			
		}
	
	}
}
