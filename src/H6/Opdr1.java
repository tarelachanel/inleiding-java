package H6;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 12-9-2016.
 */
public class Opdr1 extends Applet {
    int uitkomst;

    public void init (){
        uitkomst = 113/4;
    }

    public void paint (Graphics g){
        g.drawString("Jan: "+ uitkomst,30,30);
        g.drawString("Ali: "+uitkomst,30,45);
        g.drawString("Jeanette: "+uitkomst,30,60);
        g.drawString("Ik: "+uitkomst,30,75);
    }
}
