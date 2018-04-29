package ex18_2_4_Object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import ex18_2_3_Object.BufferInputStreamExample;

public class BufferedOutputStreamExample {
	public static void main(String args[])
	{
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			for(int i = '1' ; i <='9' ; i++) {
				bos.write(i);
			}
			//fos.close();
			bos.close();
			
		//	bos.flush();	// 중간에 버퍼가 다 차기전에 보내줘야 할때 사용
		//	fos.close();
		}catch(Exception e) {}
		try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("123.txt"));
			
			byte arr[] = new byte[10];
			while(true) {
			int num = in.read(arr);
			if(num < 0 )
				break;
			for(int i = 0 ; i < num ; i++)
				System.out.print(arr[i]+" ");
			
			}
		}catch(Exception e) {}
	}
}
