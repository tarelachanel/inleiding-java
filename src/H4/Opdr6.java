package H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 8-9-2016.
 */
public class Opdr6 extends Applet {

    public void init(){
    }

    public void paint (Graphics g){
        g.drawRoundRect(60,60, 80,220,20,20 );
        g.setColor(Color.black);
        g.fillRoundRect(60,60,80,220,20,20);
        g.setColor(Color.red);
        g.drawOval(75,80,50,50);
        g.fillOval(75,80,50,50);
        g.setColor(Color.orange);
        g.drawOval(75,145,50,50);
        g.fillOval(75,145,50,50);
        g.setColor(Color.green);
        g.drawOval(75,210,50,50);
        g.fillOval(75,210,50,50);
    }
}
