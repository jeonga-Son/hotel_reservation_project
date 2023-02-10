package danolja;

import java.util.Scanner;

import room.RoomService;

public class Main {

	public static void main(String[] args) {
		RoomService rs = new RoomService();
		Scanner sc = new Scanner(System.in);
		rs.makeRoom();
		
		System.out.println("<'다잡아' 호텔 예약 사이트에 오신걸 환영합니다!>");
		System.out.println("=====================================");
		
		while(true) {
			int idx = 0;
			System.out.println("- 원하는 메뉴를 선택하세요.");
			System.out.println("1. 객실 조회");
			System.out.println("2. 객실 예약");
			System.out.println("3. 예약 확인");
			System.out.println("4. 예약 취소");
			System.out.println("5. 체크인");
			System.out.println("6. 체크아웃");
			System.out.println("7. 관리자 메뉴");
			System.out.println("8. 종료");
			
			System.out.print("\n=> 메뉴 입력 : ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				rs.showRoomList();
				break;
				
			case "2":
				break;
				
			case "3":
				break;
				
			case "4":
				break;
				
			case "5":
				break;
				
			case "6":
				break;
				
			case "7":
				System.out.println("\n관리자 메뉴를 선택하셨습니다.");
				System.out.print("관리자 아이디 입력 : ");
				String admId = sc.nextLine();
			
				System.out.print("관리자 번호 입력 : ");
				String admPw = sc.nextLine();
				
				break;
				
			case "8":
				idx = -1;
				break;
				
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다. 다시 입력해주세요.\n");
				break;
			}
			
			if (idx == -1) {
				System.out.println("호텔 예약 프로그램을 종료합니다.");
			}
		}

	}

}