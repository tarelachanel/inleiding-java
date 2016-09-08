package H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 7-9-2016.
 */
public class Opdr4 extends Applet{

    public void init (){
    }

    public void paint (Graphics g){
        g.drawString("0", 50,310);
        g.drawString("20",42,260);
        g.drawString("40",42,220);
        g.drawString("60",42,180);
        g.drawString("80",42,140);
        g.drawString("100",38,100);
        g.drawString("120",38,60);
        g.drawString("Valerie", 80, 315);
        g.drawString("Jeroen", 140,315);
        g.drawString("Hans", 200, 315);

        g.drawLine(60,60,60,300);
        g.drawLine (60, 300, 300, 300);
        g.drawRect(80, 220, 30, 80);
        g.setColor(Color.magenta);
        g.fillRect(80, 220, 30, 80);
        g.setColor(Color.black);
        g.drawRect(140, 100, 30, 200);
        g.setColor(Color.cyan);
        g.fillRect (140, 100, 30, 200);
        g.setColor(Color.black);
        g.drawRect(200, 180, 30, 120);
        g.setColor(Color.green);
        g.fillRect(200, 180, 30, 120);

    }
}
