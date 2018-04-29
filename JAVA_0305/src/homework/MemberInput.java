package homework;

import java.util.*;

public class MemberInput {
	public static void main(String args[]) {
	
		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
		Scanner sc = new Scanner(System.in);
		do {
			menu(); //�޴� ����ϴ� �޼��� ȣ��

			
			String select = sc.nextLine();

			// ���ڰ� �ƴϸ� �ٽ� �޴� ȣ���մϴ�.
			if (!isNumber(select)) {
				System.out.println("�ݵ�� ���� �Է��ϼ���.");
			} else {
				int selector = Integer.parseInt(select);
				switch (selector) {
				case 1:  //�Է��մϴ�.
					input(list, sc);
					break;
				case 2:  //�˻��մϴ�.
					search(list, sc);
					break;
				case 3:  //�����մϴ�.
					update(list,sc);
					break;

				case 5:  //����մϴ�.
					printAll(list);
					break;

				case 6: //�����մϴ�.
					System.out.println("�����մϴ�.");
					sc.close();
					return;
				default:
					System.out.println("1 �Ǵ� 5 �Ǵ� 6�� ���ڸ� �Է��ϼ���");
				}
			}
			System.out.println();
		} while (true);

	}
	static void printupdate(ArrayList<MemberInfo> obj, int index) {
		if(index == -1) {
			System.out.println("==== ������ �����Ͱ� �����ϴ�.=====");
			return;
		}
		System.out.println("***���������� �����Ǿ����ϴ�.***");
			System.out.println("���� : " + obj.get(index).getName());
			System.out.println("���� : " + obj.get(index).getAge());
			System.out.println("E-Mail: " + obj.get(index).getEmail());
			System.out.println("�ּ� : " + obj.get(index).getAddress());
			System.out.println();
		
	}
	static void update(ArrayList<MemberInfo> list, Scanner sc) {
		System.out.println("=== ������ �׸��� �����ϼ��� ===");
		searchMenu();
		String num;
		String name ,age ,email ,address;
		String reName , reAge ,reEmail, reAddress;
		boolean pandan;
		do {
			System.out.println("=== �˻��� �׸��� �����ϼ��� ===");
			num = sc.nextLine();
			pandan = isNumber(num);
			if (pandan == false)
				System.out.println("�˻��� �׸��� ���ڷ� �Է��ϼ���");
		} while (!pandan);
		
		switch (num) {
		case "1":  //����
			System.out.println("������ ������ (��) �Է��ϼ���");
			name = sc.nextLine();
			pandan = isNumber(name);
			if (pandan == true) {
				System.out.println("***������ �����Ͱ� �����ϴ�***");
				break;
			}
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getName().equals(name)) {
					System.out.println("���� �� ������(��) �Է��ϼ���");
					reName = sc.nextLine();
					list.get(i).setName(reName);
					printupdate(list, i);
				}
				else
					printupdate(null, -1);
			}
			break;
		case "2":  //����
			do {
				System.out.println("������ ������ (��) �Է��ϼ���");
				age = sc.nextLine();
				pandan = isNumber(age);
			} while (!pandan);
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getAge() == Integer.parseInt(age)) {
					System.out.println("���� �� ������(��) �Է��ϼ���");
					reAge = sc.nextLine();
					list.get(i).setAge(Integer.parseInt(reAge));
					printupdate(list, i);
				}
				else
					printupdate(null, -1);
			}
			break;

		case "3":  //E-Mail
			System.out.println("������ E-Mail�� (��) �Է��ϼ���");
			email = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getEmail().equals(email)) {
					System.out.println("���� �� E-Mail��(��) �Է��ϼ���");
					reEmail = sc.nextLine();
					list.get(i).setEmail(reEmail);
					printupdate(list, i);
				}
				else
					printupdate(null, -1);
			}
			break;

		case "4": //�ּ�
			System.out.println("������ �ּ���(��) �Է��ϼ���");
			address = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getAddress().equals(address)) {
					System.out.println("���� �� �ּ���(��) �Է��ϼ���");
					reAddress = sc.nextLine();
					list.get(i).setAddress(reAddress);
					printupdate(list, i);
				}
				else
					printupdate(null, -1);
			}
			return;
		default:
			System.out.println("====�׸� �߿� �������ּ���====");
		}
		
	}

	static void search(ArrayList<MemberInfo> list, Scanner sc) {
		System.out.println("===�˻��� �׸��� �����ϼ���===");
		searchMenu();
		String num;
		String name ,age ,email ,address;
		boolean pandan;
		do {
			System.out.println("=== �˻��� �׸��� �����ϼ��� ===");
			num = sc.nextLine();
			pandan = isNumber(num);
			if (pandan == false)
				System.out.println("�˻��� �׸��� ���ڷ� �Է��ϼ���");
		} while (!pandan);
		
		switch (num) {
		case "1":  //����
			System.out.println("������ (��) �Է��ϼ���");
			name = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getName().equals(name)) {
					printSearch(list, i);
				}
				else
					printSearch(null, -1);
			}
			break;
		case "2":  //����
			do {
				System.out.println("������ (��) �Է��ϼ���");
				age = sc.nextLine();
				pandan = isNumber(age);
			} while (!pandan);
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getAge() == Integer.parseInt(age)) {
					printSearch(list, i);
				}
				else
					printSearch(null, -1);
			}
			break;

		case "3":  //E-Mail
			System.out.println("E-Mail�� (��) �Է��ϼ���");
			email = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getEmail().equals(email)) {
					printSearch(list, i);
				}
				else
					printSearch(null, -1);
			}
			break;

		case "4": //�ּ�
			System.out.println("�ּ���(��) �Է��ϼ���");
			address = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getAddress().equals(address)) {
					printSearch(list, i);
				}
				else
					printSearch(null, -1);
			}
			return;
		default:
			System.out.println("====�׸� �߿� �������ּ���====");
		}
		

	}
	static void searchMenu() {
		 System.out.println("1. ����");
		 System.out.println("2. ����");
		 System.out.println("3. E-Mail");
		 System.out.println("4. �ּ�");
		 System.out.println("==>");
	}
	static boolean isNumber(String select) {
		boolean pandan = false;
		for(int i = 0 ; i < select.length() ; i++) {
			if(select.charAt(i) >= 48 && select.charAt(i) <= 57) {
				pandan = true;
			}
			else
				break;
		}
		
		
		return pandan;
	}
	static void menu() {
		 System.out.println("���� �� �����ϼ���(�ݵ�� ���� �Է�)");
		 System.out.println("1. �Է�");
		 System.out.println("2. �˻�");
		 System.out.println("3. ����");
		 System.out.println("5. ���");
		 System.out.println("6. ����");
		 System.out.println("==>");
	}
	static void input(ArrayList<MemberInfo> member , Scanner sc) {
		boolean pandan;
		String age_imsi;
		String checkOut = "";
		
		while (true) {
			MemberInfo mb = new MemberInfo();
			System.out.println("������ �Է��ϼ���?");
			mb.setName(sc.nextLine());
			do {
				System.out.println("���̴� ���ڸ� �Է��ϼž� �մϴ�");
				System.out.println("���̸� �Է��ϼ���?");
				age_imsi =sc.nextLine();
				pandan = isNumber(age_imsi);
			}while(!pandan);
			mb.setAge(Integer.parseInt(age_imsi));
			
			System.out.println("E-MAil�� �Է��ϼ���?");
			mb.setEmail(sc.nextLine());
			System.out.println("�ּҸ� �Է��ϼ���?");
			mb.setAddress(sc.nextLine());
			do{
				System.out.println("����ҷ��� y, ������� n�� �Է�?");
				checkOut = sc.nextLine();
				if(checkOut.equals("y"))
					break;
				else if(checkOut.equals("n")) {
					member.add(mb);
					return;
				}
			}while(true);
			member.add(mb);
		}
		
	}

	static void printAll(ArrayList<MemberInfo> obj) {
		if(obj.size() == 0) {
			System.out.println("=====����� �����Ͱ� �����ϴ�.=====");
			return;
		}
		System.out.println("======MemberInfo=======");
		for (int i = 0; i < obj.size(); i++) {
			System.out.println("���� : " + obj.get(i).getName());
			System.out.println("���� : " + obj.get(i).getAge());
			System.out.println("E-Mail: " + obj.get(i).getEmail());
			System.out.println("�ּ� : " + obj.get(i).getAddress());
			System.out.println();
		}
	}
	static void printSearch(ArrayList<MemberInfo> obj, int index) {
		if(index == -1) {
			System.out.println("=====����� �����Ͱ� �����ϴ�.=====");
			return;
		}
		System.out.println("======�˻��� " +index+"° ������ �Դϴ�=======");
			System.out.println("���� : " + obj.get(index).getName());
			System.out.println("���� : " + obj.get(index).getAge());
			System.out.println("E-Mail: " + obj.get(index).getEmail());
			System.out.println("�ּ� : " + obj.get(index).getAddress());
			System.out.println();
		
	}
	
}
