package H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 10-9-2016.
 */
public class Praktijkopdr extends Applet {

    public void init (){
    }

    public void paint (Graphics g){
        g.drawLine(60,60,400,60);
        g.drawRect(60,100,340,200);
        g.setColor(Color.magenta);
        g.fillRect(430,100,340,200);
        g.setColor(Color.black);
        g.drawOval(430,100,340,200);
        g.drawOval(800,100,340,200);
        g.setColor(Color.magenta);
        g.fillArc(800, 100, 340, 200, 0, 40);
        g.setColor(Color.black);
        g.drawRoundRect(60,340,340,200,60,60);
        g.setColor(Color.magenta);
        g.fillOval(430,340,340,200);
        g.setColor(Color.black);
        g.drawOval(870,340,200,200);
        g.drawString("Lijn.",200,80);
        g.drawString("Rechthoek.",200,320);
        g.drawString("Gevulde rechthoek met ovaal.",500,320);
        g.drawString("Taartpunt met ovaal eromheen.", 890,320);
        g.drawString("Afgeronde rechthoek.", 180, 560);
        g.drawString("Gevulde ovaal", 560,560);
        g.drawString("Cirkel", 950,560);
    }
}
