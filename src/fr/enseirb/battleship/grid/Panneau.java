package fr.enseirb.battleship.grid;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
	
	private int dimX;
	private int dimY;
	private int dim=800;
	//private Grid init=new Grid();
	
  public void paintComponent(Graphics g){
	  int i;
	  int x=0;
	  int y=0;
	  
	 // this.dimX=init.GetDimX();
	 // System.out.println("dimX:"+dimX);
	  
	  
	  Font font = new Font("Courier", Font.BOLD, 20);
	    g.setFont(font);
	   // g.setColor(Color.red);      
	
    x=(dim)/((dimX+1));
    y=(dim)/((dimY+1));
      g.drawString("Miss", y*5-3*x/4, x*4-2*y/5);
      
      
    for(i=1;i<=dimX;i++){
    	if (i==1){
    		g.drawLine(0,x*i+2,this.getWidth(), x*i+2);
    		g.drawLine(0,x*i+2,this.getWidth(), x*i+2);
    	}
    	g.drawLine(0,x*i,this.getWidth(), x*i);
    	
    }
    for(i=1;i<=dimY;i++){
    	if (i==1){
    		g.drawLine(y*i+2,0,y*i+2,this.getHeight());
    		g.drawLine(y*i+2,0,y*i+2,this.getHeight());
    	}
    	g.drawLine(y*i,0,y*i,this.getHeight());
    }

    
     // g.drawLine(e,e*7,0,e*8);
	 // g.drawLine(e,e*8,0,e*7);
	  
	  g.drawOval(2*y, 2*x, y, 4*x);  
	  g.fillOval(y, x, y, x);
	  g.fillOval(2*y,2*x , y,x );
	  //crossLine(g,1,9,e);
	
	 
  }               
  
	/* void crossLine(Graphics g,int x,int y,int e){    
		 g.drawLine(e*x,e*(y-1),e*x,e*y);
		 g.drawLine(e*x,e*y,e*x,e*(y-1));
	 }*/
  public Panneau(Grid test){
	  setXY(test);
	  
	  
  }
  public void setXY(Grid test){
	  this.dimX=test.GetDimX();
	  this.dimY=test.GetDimY();
	 
  }
  
}       
