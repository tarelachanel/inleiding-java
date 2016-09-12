package H5;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 12-9-2016.
 */
public class Opdr1 extends Applet {
Color zwart, roze;
int breedte, hoogte;

    public void init (){
       zwart = Color.black;
        roze = Color.magenta;
        breedte = 340;
        hoogte = 200;
    }

    public void paint (Graphics g){
        g.drawLine(60,60,400,60);
        g.drawRect(60,100,breedte,hoogte);
        g.setColor(Color.magenta);
        g.fillRect(430,100,breedte,hoogte);
        g.setColor(zwart);
        g.drawOval(430,100,breedte,hoogte);
        g.drawOval(800,100,breedte,hoogte);
        g.setColor(roze);
        g.fillArc(800, 100, breedte, hoogte, 0, 40);
        g.setColor(zwart);
        g.drawRoundRect(60,breedte,breedte,hoogte,60,60);
        g.setColor(roze);
        g.fillOval(430,breedte,breedte,hoogte);
        g.setColor(zwart);
        g.drawOval(870,breedte,hoogte,hoogte);
        g.drawString("Lijn.",200,80);
        g.drawString("Rechthoek.",200,320);
        g.drawString("Gevulde rechthoek met ovaal.",500,320);
        g.drawString("Taartpunt met ovaal eromheen.", 890,320);
        g.drawString("Afgeronde rechthoek.", 180, 560);
        g.drawString("Gevulde ovaal", 560,560);
        g.drawString("Cirkel", 950,560);
    }
}


