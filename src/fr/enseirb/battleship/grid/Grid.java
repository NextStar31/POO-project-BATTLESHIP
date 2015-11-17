package fr.enseirb.battleship.grid;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import fr.enseirb.battleship.exception.InvalidGridException;


public class Grid {
	
	private int dimX;
	private int dimY;
	private int numberSubmarines;
	private int numberBattleships;
	private int numberDestroyers;
	private int numberPatrolboards;
	private int numberAircraftcarriers;
	   
	public Grid (){
		
	}
	
	public void affiche(){
	    System.out.println("dimX:"+dimX); 
	    System.out.println("dimY:"+dimY);
	    System.out.println("numberBattleships:"+numberBattleships);
	    System.out.println("numberSubmarines:"+ numberSubmarines);
	    System.out.println("numberDestroyers:"+numberDestroyers); 
	    System.out.println("numberPatrolboards:"+numberPatrolboards);
	    System.out.println("numberAircraftcarriers:"+numberAircraftcarriers);
	}

	public void extract (Element racine) throws InvalidGridException{
			   
		List list = racine.getChildren("dimensions");
		List ship = racine.getChildren("ships");
			
				 
		Iterator i = list.iterator();
		while(i.hasNext()){
			Element courant = (Element)i.next();
			
			if(Integer.parseInt(courant.getChild("horizontal").getText())<10){ //on vérifie que la taille minimal de la carte soit de 10 par 10 
				throw new InvalidGridException(0);
			}
			else{
			dimX= Integer.parseInt(courant.getChild("horizontal").getText());
			}
			if(Integer.parseInt(courant.getChild("vertical").getText())<10){
				throw new InvalidGridException(0);
			}
			else{
			dimY= Integer.parseInt(courant.getChild("vertical").getText());  
			}
		}  
				      
		Iterator j = ship.iterator();
		while(j.hasNext()){
			Element courant = (Element)j.next();
			if(Integer.parseInt(courant.getChild("battleship").getText())<0 ||  
				Integer.parseInt(courant.getChild("submarine").getText())<0 || 
				Integer.parseInt(courant.getChild("destroyer").getText())<0 ||
				Integer.parseInt(courant.getChild("patrol-boat").getText())<0 ||
				Integer.parseInt(courant.getChild("aircraft-carrier").getText())<0) //on vérifie que aucun nombre n'est négatif
			{
				throw new InvalidGridException(2);
			}
			else{
				numberBattleships= Integer.parseInt(courant.getChild("battleship").getText()); 
				numberSubmarines= Integer.parseInt(courant.getChild("submarine").getText());
				numberDestroyers = Integer.parseInt(courant.getChild("destroyer").getText()); 
				numberPatrolboards = Integer.parseInt(courant.getChild("patrol-boat").getText());
				numberAircraftcarriers= Integer.parseInt(courant.getChild("aircraft-carrier").getText());
			}
		}
	}
	
	public int GetDimX(){
		return dimX;

	}
	public int GetDimY(){
		return dimY;

	}


}