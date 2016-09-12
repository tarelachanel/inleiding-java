package H6;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 12-9-2016.
 */
public class Opdr3 extends Applet {
int int1, int2, uitkomst;

    public void init (){
        int1 = 4;
        int2 = 6;
        uitkomst = - (int1 + int2);
    }

    public void paint (Graphics g){
        g.drawString(""+uitkomst, 30,30);
    }
}
