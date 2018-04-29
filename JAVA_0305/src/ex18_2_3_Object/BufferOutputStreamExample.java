package ex18_2_3_Object;

import java.io.*;
/*
java.lang.Object
java.io.OutputStream
java.io.FilterOutputStream
java.io.BufferedOutputStream*/

// BufferedOutputStream(OutputStream out) - size�� ���� ��� 8192����Ʈũ��
// BufferedOutputStream(OutputStream out , int size) - ������ ���� ����
public class BufferOutputStreamExample {
	public static void main(String args[]) {
			try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("output1.dat"))){
					byte arr[]= {0 ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19	};
				
					for(int cnt = 0 ; cnt < arr.length; cnt++) {
						out.write(arr[cnt]);
					}
				}catch(Exception e) {
					System.out.println("���Ϸ� ����� �� �����ϴ�.");
				}
				
		}
	

}
