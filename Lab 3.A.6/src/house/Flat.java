package house;
// import java.io.IOException;

public class Flat {
	private final String ID;
	private int number;
	private int floor;
	private float area;
	private byte rooms;
	StringBuilder theString;
	
//	constructor
	Flat(String houseID, int preNumber, int preFloor) {
		setNumber(preNumber);
		setFloor(preFloor);
		setArea();
		setRooms();
		this.ID = setID(houseID);
	}
	
//	autoset-methods
	public String setID(String houseID) {
		Integer preID = (int) (Math.random() * 1000 + 1);
		return houseID + preID.toString() + this.number;
	}
	public void setNumber(int preNumber) {
		this.number = preNumber;
	}
	public void setFloor(int preFloor) {
		this.floor = preFloor;
	}
	public void setArea() {
		this.area = (float) (Math.random() * 100 + 60);
	}
	public void setRooms() {
		this.rooms = (byte) (Math.random() * 5 + 1);
	}	
	
//	get-methods
	public String getID() {
		return this.ID;
	}
	public int getNumber() {
		return this.number;
	}
	public int getFloor() {
		return this.floor;
	}
	public float getArea() {
		return this.area;
	}
	public byte getRooms() {
		return this.rooms;
	}

//	toString-method	
	@Override
	public String toString() {
		this.theString = new StringBuilder()
				.append("ID:" + this.ID)
				.append("\nNumber: " + this.number)
				.append("\nFloor: " + this.floor)
				.append("\nTotal area: " + this.area + " sq.m.")
				.append("\nNumber of rooms: " + this.rooms);
		return theString.toString();
	}

	public void toShow() {
		System.out.println("___________________________");
		System.out.println(theString);
	}
	
}
