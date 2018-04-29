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
				System.out.println("�̸��� �Է��ϼ���?");
				name = sc.nextLine();
				out.writeUTF(name);
				System.out.println("���� ������ �Է��ϼ���?");
				kor = sc.nextInt();
				out.writeInt(kor);
				System.out.println("���� ������ �Է��ϼ���?");
				eng = sc.nextInt();
				out.writeInt(eng);
				System.out.println("���� ������ �Է��ϼ���?");
				math = sc.nextInt(); // ���� ���� �Է� �� ���͸� �Է��ϴµ� ���������� math�� �������� ���ʹ� nextLine()�� �������ϴ�.
				out.writeInt(math);
				sc.nextLine();
				System.out.println("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ����)");
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