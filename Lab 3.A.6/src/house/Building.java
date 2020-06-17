package house;
import attribute.*;
import thePackage.SomeException;

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Building {
	
	protected final String ID;
	
	private String type;
	private int floors;
	private int flats;
	private String adress;
	private String period;
	
	private ArrayList<Flat> apartments;

	
	private StringBuilder theString;
	
	public static Scanner scan = new Scanner(System.in);
	
//	default constructor (without parameters)
	public Building() throws SomeException {
		this.ID = setID();
		setType();
		setFloors();
		setFlats();
		setAdress();
		setPeriod();
	}
//	user's constructor (with a parameter)
	public Building(boolean self) throws SomeException {
		this.ID = setID();
		setYourType();
		setYourFloors();
		setYourFlats();
		setYourAdress();
		setYourPeriod();
	}
	
//	autoset-methods
	public String setID() {
		StringBuilder preID = new StringBuilder(5);
		for (int i = 0; i < 5; i++) {
			preID.append((char) Math.round(Math.random() * 35 + 65));
		}
		return preID.toString();
	}
	public void setType() throws SomeException {
		this.type = DefaultData.getRandomType();	
	}
	public void setFloors() {
		switch(this.type) {
		case "Historical building":
			this.floors = (int) (Math.random() * 7 + 1);
			break;
		case "Apartment block":
			this.floors = (int) (Math.random() * 35 + 5);
			break;
		case "Skyscraper":
			this.floors = (int) (Math.random() * 80 + 40);
			break;
		}
	}
	public void setFlats() {
		switch(this.type) {
		case "Historical building":
			this.flats = this.floors * (int) (Math.random() * 4 + 1);
			break;
		case "Apartment block":
			this.flats = this.floors * (int) (Math.random() * 20 + 1);
			break;
		case "Skyscraper":
			this.flats = this.floors * (int) (Math.random() * 6 + 1);
			break;
		}
	}
	public void setAdress() throws SomeException {
		this.adress = DefaultData.getRandomStreet();;
		this.adress += ", " + (int) (Math.random() * 100 + 1);
	}
	public void setPeriod() {
		this.period = (short) (Math.random() * 28 + 1) + "." + (short) (Math.random() * 12 + 1) + "." + (short) (Math.random() * 25 + 2020);
	}
	
//	set-methods
	public void setYourType() throws SomeException {
		System.out.println("Choose a type of your building [Historical building / Apartment block / Skyscraper]: ");
		this.type = scan.nextLine();
		DefaultData.types.add(this.type);
	}
	public void setYourFloors() {
		System.out.println("Input a number of floors: ");
		this.floors = scan.nextInt();
	}
	public void setYourFlats() {
		System.out.println("Input a number of flats: ");
		this.flats = scan.nextInt();
	}
	public void setYourAdress() {
		System.out.println("Input an adress [street, building]: ");
		this.adress = scan.nextLine();
		DefaultData.streets.add(adress.split(", ")[0]);
	}
	public void setYourPeriod() {
		System.out.println("Input a using period [DD.MM.YYYY]: ");
		this.period = scan.nextLine();
	}
	
//	get-methods
	public String getID() {
		return this.ID;
	}
	public String getType() {
		return this.type;
	}
	public int getFloors() {
		return this.floors;
	}
	public int getFlats() {
		return this.flats;
	}
	public String getAdress() {
		return this.adress;
	}
	public String getPeriod() {
		return this.period;
	}

	public ArrayList<Flat> getAllFlats() {
		return this.apartments;
	}
	
	public void showAllFlats() {
		for (int i = 0; i < apartments.size(); i++) {
			System.out.println("________________________________________");
			System.out.println(this.apartments.get(i).toString());
		}
	}

	public void createApartments() {
		apartments = new ArrayList<>();
		int rightFloor;
		for (int i = 1; i < this.flats + 1; i++) {
			rightFloor = i / (this.flats / this.floors) + 1;
			apartments.add(new Flat(this.ID, i, rightFloor));
		}
	}
	
// toString-method
	@Override
	public String toString() {
		this.theString = new StringBuilder()
				.append("ID:" + this.ID)
				.append("\nType of building: " + this.type)
				.append("\nNumber of floors: " + this.floors)
				.append("\nNumber of flats: " + this.flats)
				.append("\nAdress: " + this.adress)
				.append("\nOperation period: " + this.period);
		return theString.toString();
	}

}
