package jkk;

import java.awt.*;
import java.awt.event.*;
public class Anonymscls
{
 	private Frame f;
 	public Anonymscls() 	{
     		f = new Frame("Hello .....!");
 	}
 	public void launchFrame() 
	{
 		f.setSize(170,170);
	 	f.setBackground(Color.red);
	 	f.setVisible(true);	
	// Add a window listener
	
	 f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent evt)
	{
		System.exit(0);
	}
	});   //Anonymous Inner Classes 

	 }



 	public static void main(String args[]) 
	{
 		Anonymscls an = new Anonymscls();
		an.launchFrame();
	}
}
