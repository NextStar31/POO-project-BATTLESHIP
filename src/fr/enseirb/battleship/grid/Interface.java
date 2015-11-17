package fr.enseirb.battleship.grid;

import javax.swing.JFrame;

 
import java.awt.Color; 
import javax.swing.JPanel;

 

public class Interface extends JFrame {


    public Interface(){                

      this.setTitle("Ma première fenêtre Java");

      this.setSize(800, 800);

      this.setLocationRelativeTo(null);               

      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.setContentPane(new Panneau());


      this.setVisible(true);

    }  
  
public static void main(String[] args){

    	    Interface fenetre = new Interface();
    	                
    	  }       

              
}