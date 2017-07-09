package javaSession4Assignment2;

class Building{
	private int rooms, floors;
	
	public void details(){
		System.out.println("*****Is-a relationship*****");
		System.out.println("House is a building");
		System.out.println("Number of floors: "+floors);
		System.out.println("Number of rooms: "+rooms);
	}

	/**
	 * @return the rooms
	 */
	public int getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	/**
	 * @return the floors
	 */
	public int getFloors() {
		return floors;
	}

	/**
	 * @param floors the floors to set
	 */
	public void setFloors(int floors) {
		this.floors = floors;
	}
	
}

class House extends Building{
	public void housePet(){
		Pet dog = new Pet();
		dog.gaurd();
	}
}

class Pet{
	public void gaurd(){
		System.out.println("*****Has-a relationship*****");
		System.out.println("House has a pet");
		System.out.println("Pet guards the house");
	}
	
}

public class RelationsDemo {

	public static void main(String[] args) {
		House myHouse = new House();
		myHouse.setFloors(2); 
		myHouse.setRooms(5);
		myHouse.details(); // is-a relationship, calls the superclass method
		myHouse.housePet(); // has-a relationship
	}

}
