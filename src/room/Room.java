package room;

public class Room {
	private String type;
	private int roomNo;
	private int price;
	private int maxPeopleNum;
	private int roomAmount;
	
	public Room() {}

	public Room(String type, int roomNo, int price, int maxPeopleNum, int roomAmount) {
		super();
		this.type = type;
		this.roomNo = roomNo;
		this.price = price;
		this.maxPeopleNum = maxPeopleNum;
		this.roomAmount = roomAmount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxPeopleNum() {
		return maxPeopleNum;
	}

	public void setMaxPeopleNum(int maxPeopleNum) {
		this.maxPeopleNum = maxPeopleNum;
	}

	public int getRoomAmount() {
		return roomAmount;
	}

	public void setRoomAmount(int roomAmount) {
		this.roomAmount = roomAmount;
	}

	
}
