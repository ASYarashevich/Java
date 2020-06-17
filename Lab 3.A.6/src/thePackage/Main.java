/*
 * Глава 3. Вариант А. Задание 6.
 * Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов. 
 * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации. Создать массив объектов.
 * Вывести: a) список квартир, имеющих заданное число комнат;
 * 			b) список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке;
 * 			c) список квартир, имеющих площадь, превосходящую заданную.
 */

package thePackage;
import house.Building;

import java.io.IOException;
import java.util.Scanner;

import attribute.DefaultData;

public class Main {

	public static void main(String[] args) throws IOException, SomeException {
		Scanner sc = new Scanner(System.in);
		DefaultData.fillWithData();
		System.out.println("Would you like to create a house by yourself? - ");
		boolean choice = 1 == sc.nextInt();
		Building theHouse;
		if (choice) {
			theHouse = new Building(choice);
		} else {
			theHouse = new Building();
		}
		String info = theHouse.toString();
		System.out.println("\n" + info);
		theHouse.createApartments();
		System.out.println("The house is now filled with apartments.");
/*
		System.out.println("Do you feel like observing all of them? - ");
		boolean observe = 1 == sc.nextInt();
		if (observe) {
			theHouse.showAllFlats();
		}
*/
		System.out.println("\nChoose a search criteria (1, 2, 3): ");
		byte criteria = sc.nextByte();
		switch(criteria) {
		case 1:
			System.out.println("Input a number of rooms you need: ");
			byte rightRooms01 = sc.nextByte();
			for (int i = 0; i < theHouse.getAllFlats().size(); i++) {
				if (theHouse.getAllFlats().get(i).getRooms() == rightRooms01) {
					theHouse.getAllFlats().get(i).toString();
					theHouse.getAllFlats().get(i).toShow();
				}
			}
			break;
		case 2:
			System.out.println("Input a number of rooms you need: ");
			byte rightRooms02 = sc.nextByte();
			System.out.println("Input a floor range you need [from/to]: ");
			short fromFloor = sc.nextShort();
			short toFloor = sc.nextShort();
			for (int i = 0; i < theHouse.getAllFlats().size(); i++) {
				if (theHouse.getAllFlats().get(i).getRooms() == rightRooms02 && theHouse.getAllFlats().get(i).getFloor() > fromFloor && theHouse.getAllFlats().get(i).getFloor() < toFloor) {
					theHouse.getAllFlats().get(i).toString();
					theHouse.getAllFlats().get(i).toShow();
				}
			}
			break;
		case 3:
			System.out.println("Input a minimum area of an apartment: ");
			float fromArea = sc.nextFloat();
			for (int i = 0; i < theHouse.getAllFlats().size(); i++) {
				if (theHouse.getAllFlats().get(i).getArea() >+ fromArea) {
					theHouse.getAllFlats().get(i).toString();
					theHouse.getAllFlats().get(i).toShow();
				}
			}
			break;
		default: throw new SomeException("Some sort of a mistake has happened");
		}
		System.out.println("\nEnd of the program");
		Building.scan.close();
		sc.close();
	}
}