package fractals;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.awt.geom.GeneralPath;

public class FractalLine

{

   public void draw(Graphics2D g2, int iteration, double x1, double y1, double width, double height, double start, double extent)

   {

      if (iteration == 1)

      {
    	  //Arc2D.Double(double x, double y, double w, double h, double start, double extent, int type)
         g2.draw(new Arc2D.Double(x1, y1, width, height, start, extent, Arc2D.OPEN));

      }

      else

      {

         double angle = 60 * Math.PI / 180; // 60 degrees

         double dx = (x1 + width) / 4;

         double dy = (y1 + height) / 4;

         double x2 = x1 + dx;

         double y2 = y1 + dy;

         double x3 = x1 + 2 * dx;

         double y3 = y1 + 2 * dx;

         double x4 = x3 + dx * Math.cos(angle) + dy * Math.sin(angle);

         double y4 = y3 + dy * Math.cos(angle) - dx * Math.sin(angle);
         


         draw(g2, iteration - 1, x1, y1, width, height, extent,start);

         draw(g2, iteration - 1, x1, y1, width/3, height/3, x4, y4);

//         draw(g2, iteration - 1, ctrlX2, ctrlY2, x5, y5, x4, y4);
//
//         draw(g2, iteration - 1, ctrlX2, ctrlY2, x4, y4, x2, y2);        

      }

   }

}