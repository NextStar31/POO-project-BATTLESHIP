package fr.enseirb.battleship.grid;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
	
	private int dim=10;
	
	
  public void paintComponent(Graphics g){
	  int i;
	  int e=0;
	  
	  
	  Font font = new Font("Courier", Font.BOLD, 20);
	    g.setFont(font);
	   // g.setColor(Color.red);      
	
    e=(this.getWidth()+this.getHeight())/(2*dim);
    
      g.drawString("Miss", e*5-3*e/4, e*4-2*e/5);
      
      
    for(i=1;i<dim;i++){

    	g.drawLine(0,e*i,this.getWidth(), e*i);
    	g.drawLine(e*i,0,e*i,this.getHeight());
    }
    
    
      g.drawLine(e,e*7,0,e*8);
	  g.drawLine(e,e*8,0,e*7);
	  
	  g.fillOval(2*e, 2*e, e, 4*e);  
	  g.fillOval(0, 0, e, e);
	  g.drawOval(e,e , e,e );
	  //crossLine(g,1,9,e);
	
	 
  }               
  
	/* void crossLine(Graphics g,int x,int y,int e){    
		 g.drawLine(e*x,e*(y-1),e*x,e*y);
		 g.drawLine(e*x,e*y,e*x,e*(y-1));
	 }*/
}       
