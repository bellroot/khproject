package ex18_1_6_FileIO;

import java.io.*;
import java.util.*;

public class Student_main_method {
	public static void main(String args[]) {
		input();
	}
	static void input() {

		String pandan = "";
		String name = "";
		int kor, eng, math;
		DataOutputStream out = null;
		Scanner sc = new Scanner(System.in);
			try {
				out = new DataOutputStream(new FileOutputStream("student.txt"));
				while (!pandan.equalsIgnoreCase("q")) {
				System.out.println("이름을 입력하세요?");
				name = sc.nextLine();
				out.writeUTF(name);
				System.out.println("국어 점수를 입력하세요?");
				kor = sc.nextInt();
				out.writeInt(kor);
				System.out.println("영어 점수를 입력하세요?");
				eng = sc.nextInt();
				out.writeInt(eng);
				System.out.println("수학 점수를 입력하세요?");
				math = sc.nextInt(); // 수학 점수 입력 후 엔터를 입력하는데 수학점수는 math가 가져가고 엔터는 nextLine()이 가져갑니다.
				out.writeInt(math);
				sc.nextLine();
				System.out.println("계속입력하시겠습니까?(q 또는 Q 이면 종료)");
				pandan = sc.nextLine();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(out != null)
						out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		sc.close();
	}

	
}