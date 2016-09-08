package H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 7-9-2016.
 */
public class Opdr3 extends Applet {

    public void init (){
    }

    public void paint (Graphics g){
        g.setColor(Color.red);
        g.drawRect(60,60,100, 20);
        g.fillRect(60,60,100,20);
        g.setColor(Color.black);
        g.drawRect(60,80,100,20);
        g.setColor(Color.blue);
        g.drawRect(60,100,100,20);
        g.fillRect(60,100,100,20);
        g.setColor(Color.black);
        g.drawLine(60,60,60,200);
    }
}
