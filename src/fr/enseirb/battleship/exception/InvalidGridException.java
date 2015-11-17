package fr.enseirb.battleship.exception;

public class InvalidGridException extends Exception {

	public InvalidGridException(int x) {
			switch (x) {

			case 1 :
				System.out.println("Plus de 20% de la carte occupée");

			 break;
			 
			case 2 :
				System.out.println("Nombre incorrect de bateaux");

			 break;
			 
			default: 
			    System.out.println("Les dimensions ne sont pas correctes");
			 
			}

	}
}
