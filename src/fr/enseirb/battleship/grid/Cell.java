package fr.enseirb.battleship.grid;

import fr.enseirb.battleship.ship.Ship;


public class Cell {
	
	private int x;
	private int y;
	private boolean istouch; // 0 -> untouched, 1 -> touched
	private Ship content;

	public Cell() {
		istouch=false;
	}

	public void SetX(int x){
		this.x=x;
	}
	public void SetY(int y){
		this.y=y;
	}
	public void SetState(int i){
		if (i==1){
			this.istouch=true;
		}
		else if(i==0){
			this.istouch=false;
		}
	}
	public void SetContent(){
		//this.content=new content
	}
}
