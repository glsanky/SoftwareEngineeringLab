package palindrome;

import java.applet.*;
import java.awt.*;

public class  FillRectangle extends Applet{
   public void paint(Graphics g){
      g.drawRect(300,150,200,100);
      g.setColor(Color.cyan);   
      g.fillRect( 300,150, 200, 100 );
      g.setColor(Color.red);
      g.drawString("Rectangle",500,150);
   }
}