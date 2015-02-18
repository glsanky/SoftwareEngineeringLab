import java.applet.*;
import java.awt.*;

public class rectangleapplet extends Applet{
   public void paint(Graphics g){
      g.drawRect(300,150,200,100);
      g.setColor(Color.black);   
      g.fillRect( 300,150, 200, 100 );
      g.setColor(Color.red);
      g.drawString("Rectangle",500,150);
   }
}