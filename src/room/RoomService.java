package room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomService {
	List<Room> room = new ArrayList<Room>();
	Scanner sc = new Scanner(System.in);
	
	private int deluxRoomNo = 1401;
	private int suiteRoomNo = 2101;
	
	public RoomService() {}
	
	public void makeRoom() {
		Room r1 = new Room("Delux", deluxRoomNo, 100000, 2, 10);
		Room r2 = new Room("Suite", suiteRoomNo, 200000, 3, 5);
		
		room.add(r1);
		room.add(r2);
	}
	
	public void showRoomList() {
		
		System.out.println("\n1. Delux  2. Suite");
		System.out.print("=> 입력 : ");
		String menu = sc.nextLine();
		System.out.println();
		
		switch(menu) {
		case "1":
			
			for(Room r : room ) {
				if(r.getType().equals("Delux")) {
					System.out.println("[다놀자 Delux 객실 현황입니다.]");
					printRoomDetail(r);
				} 
			}
			break;
			
		case "2":
			for(Room r : room ) {
				if(r.getType().equals("Suite")) {
					System.out.println("[다놀자 Suite 객실 현황입니다.]");
					printRoomDetail(r);
				}
			}
			break;
			
		default:
			System.out.println("메뉴를 잘못 입력하셨습니다.");
			break;
		}
	}
	
	public void printRoomDetail(Room r) {
		System.out.println("==========================");
		System.out.println("객실 타입 : " + r.getType());
		System.out.println("객실 가격 : " + r.getPrice());
		System.out.println("최대 인원 : " + r.getMaxPeopleNum());
		System.out.println("남은 객실 : " + r.getRoomAmount());
		System.out.println();
	}
}
