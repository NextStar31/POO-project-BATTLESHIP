package fr.enseirb.battleship.ship;

public class Ship {
	
	private int ownerId;
	private int shipId;
	private int totalNumberLeft;
	private int numberOfCells;
	private int x;
	private int y;
	private int length;

	public Ship() {
		// TODO Auto-generated constructor stub
	}

	public int GetX(){
		return this.x;
	}
	public int GetY(){
		return this.y;
	}
	public int GetLength(){
		return this.length;
	}
}
