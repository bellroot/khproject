package ex18_1_6_FileIO;

import java.io.*;
import java.util.ArrayList;

public class Student_OutputStream {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		DataInputStream in = null ;
		try {
			
			in= new DataInputStream(new FileInputStream("student.txt"));
			while(true) {
				Student h = new Student(in.readUTF(), in.readInt(), in.readInt(), in.readInt());
				list.add(h);
			}
		}catch(EOFException e) {
			print(list);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void print(ArrayList<Student> list) {
		System.out.println("==========   학생별   /  과목별 총점구하기  ==========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
    
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).name + "\t" + list.get(i).kor + "\t" + list.get(i).eng + "\t"
					+ list.get(i).math + "\t" + list.get(i).getTotal() + "\t");
			System.out.printf("%.1f\n", list.get(i).getAverage());
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.engTotal + "\t");
		System.out.print(Student.mathTotal + "\t");

	}
}
