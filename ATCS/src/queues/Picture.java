package queues;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture extends JPanel {
	
	private Queue<String> lines = new LinkedList<String>();
	
  public Picture() {
  }
  
  public void paintComponent(Graphics g) {
	  
	int lastPoint = 0;
	int lastPoint2 = 0;
	  for (int i = 0; i < 10; i++)
	 {
		  int width = (int) (Math.random() * 500);
		    int height = (int) (Math.random() * 500);
		    g.setColor(Color.black);
		    g.drawLine(lastPoint, lastPoint2, width, height);
		    lastPoint = width;
		    lastPoint2 = height;
		    lines.add("" + lastPoint + " " + lastPoint2 + " " + width + " " + height);
		    
		  try 
		  {  
		   Thread.sleep(500);                 //1000 milliseconds is one second.
			} 
		  catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			} 
	}
	  
//	  while (!lines.isEmpty())
//	  {
//		 String[] s = new String[4];
//		 int index = 0;
//		  String line = lines.remove();
//		  for (int i = 1; i < lines.size(); i++)
//		  {
//			  if (line.substring(i-1, i).equals(" "))
//			  {
//				 s[index] =  line.substring(0, i);
//				 index++;
//				 line = line.substring(i);
//				 i = 0;
//			  }
//		  }
//		  g.setColor(Color.white);
//		  g.drawLine(Integer.parseInt(s[0]), Integer.parseInt(s[1]), 
//				  Integer.parseInt(s[2]), Integer.parseInt(s[3]));
//	  }
		
		   
	 }
   
  
  
  public static void main(String args[]) {
    JFrame frame = new JFrame("Oval Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new Picture());
    frame.setSize(1000, 1000);
    frame.setVisible(true);
  }
}