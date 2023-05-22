package j0522;

/**
 * Data
 */
public class Car {
	String color;
	String gearType;
	int door;

	Car() {
		// this.("white", "auto",4);
		color = "white";
		gearType = "auto";
		door = 4;
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

}
