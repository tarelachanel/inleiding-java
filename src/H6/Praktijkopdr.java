package H6;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 12-9-2016.
 */
public class Praktijkopdr extends Applet {
    double c1, c2, c3, gemiddelde;


    public void init (){
        c1= 5.9;
        c2= 6.3;
        c3= 6.9;
        gemiddelde= (c1+c2+c3)/3;
    }

    public void paint (Graphics g){
        g.drawString(""+((double)(int)(gemiddelde *10)/10),30,30);
    }
}
