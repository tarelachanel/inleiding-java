package H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 8-9-2016.
 */
public class Opdr7 extends Applet {

    public void init (){
    }

    public void paint (Graphics g){
        g.drawRoundRect(60,60,90,90,20,20);
        g.setColor(Color.pink);
        g.fillRoundRect(60,60,90,90,20,20);
        g.setColor(Color.black);
        g.drawOval(75,80,20,20);
        g.setColor(Color.white);
        g.fillOval(75,80,20,20);
        g.setColor(Color.black);
        g.drawOval(110,80,20,20);
        g.setColor(Color.white);
        g.fillOval(110,80,20,20);
        g.setColor(Color.black);
        g.drawOval(75,115,20,20);
        g.drawOval(110,115,20,20);
        g.setColor(Color.white);
        g.fillOval(75,115,20,20);
        g.fillOval(110,115,20,20);
    }
}
