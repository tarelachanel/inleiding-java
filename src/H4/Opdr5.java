package H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 8-9-2016.
 */
public class Opdr5 extends Applet {

    public void init (){
        setBackground(Color.blue);
    }

    public void paint (Graphics g){
        g.drawOval(20, 20, 50, 100);
        g.setColor(Color.yellow);
        g.fillOval(20,20,50,100);
    }
}
