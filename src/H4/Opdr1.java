package H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 7-9-2016.
 */
public class Opdr1 extends Applet {

    public void init (){
    }

    public void paint (Graphics g){
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, 120, 150, 320);
        g.drawLine(270,120,150,320);
    }
}
