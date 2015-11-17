package fr.enseirb.battleship;

import java.io.File;

import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import fr.enseirb.battleship.exception.InvalidGridException;
import fr.enseirb.battleship.grid.Grid;
import fr.enseirb.battleship.grid.Interface;

public class App extends Exception {
	

	static org.jdom2.Document document;
	static Element racine;
	
	public static void main(String[] args) {
		 Grid test = new Grid();
		 readerGrid(document,racine,test);
		
		 Interface fenetre = new Interface(test);

	}
	
	
	public static void readerGrid(org.jdom2.Document document,Element racine,Grid test){

	     SAXBuilder sxb = new SAXBuilder();
	     try
		     {
	         document = sxb.build(new File("test.xml"));
		     }
	      catch (Exception e){}
	     
	      racine = document.getRootElement();
	      
	      try{
	      test.extract(racine) ;
	      test.affiche();
	      }
	      catch (InvalidGridException e){System.exit(1);}
	      
	      
	
	}
}
