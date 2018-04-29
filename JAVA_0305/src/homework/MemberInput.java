package homework;

import java.util.*;

public class MemberInput {
	public static void main(String args[]) {
	
		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
		Scanner sc = new Scanner(System.in);
		do {
			menu(); //메뉴 출력하는 메서드 호출

			
			String select = sc.nextLine();

			// 숫자가 아니면 다시 메뉴 호출합니다.
			if (!isNumber(select)) {
				System.out.println("반드시 숫자 입력하세요.");
			} else {
				int selector = Integer.parseInt(select);
				switch (selector) {
				case 1:  //입력합니다.
					input(list, sc);
					break;
				case 2:  //검색합니다.
					search(list, sc);
					break;
				case 3:  //수정합니다.
					update(list,sc);
					break;

				case 5:  //출력합니다.
					printAll(list);
					break;

				case 6: //종료합니다.
					System.out.println("종료합니다.");
					sc.close();
					return;
				default:
					System.out.println("1 또는 5 또는 6의 숫자를 입력하세요");
				}
			}
			System.out.println();
		} while (true);

	}
	static void printupdate(ArrayList<MemberInfo> obj, int index) {
		if(index == -1) {
			System.out.println("==== 수정할 데이터가 없습니다.=====");
			return;
		}
		System.out.println("***성공적으로 수정되었습니다.***");
			System.out.println("성명 : " + obj.get(index).getName());
			System.out.println("나이 : " + obj.get(index).getAge());
			System.out.println("E-Mail: " + obj.get(index).getEmail());
			System.out.println("주소 : " + obj.get(index).getAddress());
			System.out.println();
		
	}
	static void update(ArrayList<MemberInfo> list, Scanner sc) {
		System.out.println("=== 수정할 항목을 선택하세요 ===");
		searchMenu();
		String num;
		String name ,age ,email ,address;
		String reName , reAge ,reEmail, reAddress;
		boolean pandan;
		do {
			System.out.println("=== 검색할 항목을 선택하세요 ===");
			num = sc.nextLine();
			pandan = isNumber(num);
			if (pandan == false)
				System.out.println("검색할 항목을 숫자로 입력하세요");
		} while (!pandan);
		
		switch (num) {
		case "1":  //성명
			System.out.println("수정전 성명을 (를) 입력하세요");
			name = sc.nextLine();
			pandan = isNumber(name);
			if (pandan == true) {
				System.out.println("***수정할 데이터가 없습니다***");
				break;
			}
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getName().equals(name)) {
					System.out.println("수정 후 성명을(를) 입력하세요");
					reName = sc.nextLine();
					list.get(i).setName(reName);
					printupdate(list, i);
				}
				else
					printupdate(null, -1);
			}
			break;
		case "2":  //나이
			do {
				System.out.println("수정전 나이을 (를) 입력하세요");
				age = sc.nextLine();
				pandan = isNumber(age);
			} while (!pandan);
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getAge() == Integer.parseInt(age)) {
					System.out.println("수정 후 나이을(를) 입력하세요");
					reAge = sc.nextLine();
					list.get(i).setAge(Integer.parseInt(reAge));
					printupdate(list, i);
				}
				else
					printupdate(null, -1);
			}
			break;

		case "3":  //E-Mail
			System.out.println("수정전 E-Mail을 (를) 입력하세요");
			email = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getEmail().equals(email)) {
					System.out.println("수정 후 E-Mail을(를) 입력하세요");
					reEmail = sc.nextLine();
					list.get(i).setEmail(reEmail);
					printupdate(list, i);
				}
				else
					printupdate(null, -1);
			}
			break;

		case "4": //주소
			System.out.println("수정전 주소을(를) 입력하세요");
			address = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getAddress().equals(address)) {
					System.out.println("수정 후 주소을(를) 입력하세요");
					reAddress = sc.nextLine();
					list.get(i).setAddress(reAddress);
					printupdate(list, i);
				}
				else
					printupdate(null, -1);
			}
			return;
		default:
			System.out.println("====항목 중에 선택해주세요====");
		}
		
	}

	static void search(ArrayList<MemberInfo> list, Scanner sc) {
		System.out.println("===검색할 항목을 선택하세요===");
		searchMenu();
		String num;
		String name ,age ,email ,address;
		boolean pandan;
		do {
			System.out.println("=== 검색할 항목을 선택하세요 ===");
			num = sc.nextLine();
			pandan = isNumber(num);
			if (pandan == false)
				System.out.println("검색할 항목을 숫자로 입력하세요");
		} while (!pandan);
		
		switch (num) {
		case "1":  //성명
			System.out.println("성명을 (를) 입력하세요");
			name = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getName().equals(name)) {
					printSearch(list, i);
				}
				else
					printSearch(null, -1);
			}
			break;
		case "2":  //나이
			do {
				System.out.println("나이을 (를) 입력하세요");
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
			System.out.println("E-Mail을 (를) 입력하세요");
			email = sc.nextLine();
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getEmail().equals(email)) {
					printSearch(list, i);
				}
				else
					printSearch(null, -1);
			}
			break;

		case "4": //주소
			System.out.println("주소을(를) 입력하세요");
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
			System.out.println("====항목 중에 선택해주세요====");
		}
		

	}
	static void searchMenu() {
		 System.out.println("1. 성명");
		 System.out.println("2. 나이");
		 System.out.println("3. E-Mail");
		 System.out.println("4. 주소");
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
		 System.out.println("다음 중 선택하세요(반드시 숫자 입력)");
		 System.out.println("1. 입력");
		 System.out.println("2. 검색");
		 System.out.println("3. 수정");
		 System.out.println("5. 출력");
		 System.out.println("6. 종료");
		 System.out.println("==>");
	}
	static void input(ArrayList<MemberInfo> member , Scanner sc) {
		boolean pandan;
		String age_imsi;
		String checkOut = "";
		
		while (true) {
			MemberInfo mb = new MemberInfo();
			System.out.println("성명을 입력하세요?");
			mb.setName(sc.nextLine());
			do {
				System.out.println("나이는 숫자를 입력하셔야 합니다");
				System.out.println("나이를 입력하세요?");
				age_imsi =sc.nextLine();
				pandan = isNumber(age_imsi);
			}while(!pandan);
			mb.setAge(Integer.parseInt(age_imsi));
			
			System.out.println("E-MAil을 입력하세요?");
			mb.setEmail(sc.nextLine());
			System.out.println("주소를 입력하세요?");
			mb.setAddress(sc.nextLine());
			do{
				System.out.println("계속할려면 y, 멈출려면 n을 입력?");
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
			System.out.println("=====출력할 데이터가 없습니다.=====");
			return;
		}
		System.out.println("======MemberInfo=======");
		for (int i = 0; i < obj.size(); i++) {
			System.out.println("성명 : " + obj.get(i).getName());
			System.out.println("나이 : " + obj.get(i).getAge());
			System.out.println("E-Mail: " + obj.get(i).getEmail());
			System.out.println("주소 : " + obj.get(i).getAddress());
			System.out.println();
		}
	}
	static void printSearch(ArrayList<MemberInfo> obj, int index) {
		if(index == -1) {
			System.out.println("=====출력할 데이터가 없습니다.=====");
			return;
		}
		System.out.println("======검색된 " +index+"째 데이터 입니다=======");
			System.out.println("성명 : " + obj.get(index).getName());
			System.out.println("나이 : " + obj.get(index).getAge());
			System.out.println("E-Mail: " + obj.get(index).getEmail());
			System.out.println("주소 : " + obj.get(index).getAddress());
			System.out.println();
		
	}
	
}
