package queues;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture extends JFrame {
	
private Queue<Double> lines = new LinkedList<Line2D.Double>();
	
  public Picture() 
  {
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setSize(800, 800);
	  setVisible(true);
  }
  
  public void paint(Graphics g) {
	  
	int lastPoint = 0;
	int lastPoint2 = 0;
	  
	for (int i = 0; i < 10; i++)
	{
		  
		 int width = (int) (Math.random() * 500);
		 int height = (int) (Math.random() * 500);
		 g.setColor(Color.black);
		 g.drawLine(lastPoint, lastPoint2, width, height);
		 lines.add(new Line2D.Double(lastPoint, lastPoint2, width, height)); 
		 lastPoint = width;
		 lastPoint2 = height;
		 
		 try 
		 {  
		  Thread.sleep(400);                 
		 } 
		  catch(InterruptedException ex) 
		  {
			  Thread.currentThread().interrupt();
		  } 
	}
	  
	  while (!lines.isEmpty())
	  {
		  Line2D.Double line = lines.remove();
		  g.setColor(Color.orange);
		  g.drawLine((int)line.getX1(), (int)line.getY1(), 
				  (int)line.getX2(), (int)line.getY2());
		  System.out.println("hi");
		  try 
		  {  
			  Thread.sleep(400);                 
		  } 
		  catch(InterruptedException ex) 
		  {
			  Thread.currentThread().interrupt();
		  } 
	  }
	  //String[] s = new String[4];
//		 int index = 0;
//		  String line = lines.remove();
//		  for (int i = 1; i < line.length()-1; i++)
//		  {
//			  if (line.length() != 0)
//			  {
//				  if (line.substring(i-1, i).equals(" "))
//				  {
//					 s[index] =  line.substring(0, i-1);
//					 index++;
//					 line = line.substring(i);
//					 i = 1;
//				  }
//			  }
//			 
//		  }
		   
	 }

}