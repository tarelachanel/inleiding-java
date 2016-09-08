package H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 7-9-2016.
 */
public class Opdr2 extends Applet {

    public void init (){
    }

    public void paint (Graphics g){
        g.drawRect(100, 300, 300, 300);
        g.drawLine(100, 300, 250, 120);
        g.drawLine(400,300,250,120);
        g.drawRect(150, 440, 80,160);
        g.drawRect(280, 400, 80,80);
    }
}
