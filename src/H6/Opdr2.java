package H6;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by tarel on 12-9-2016.
 */
public class Opdr2 extends Applet {
    int seconde, minuut, uur, dag, jaar;

    public void init (){
        seconde = 1;
        minuut= seconde * 60;
        uur = minuut * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint (Graphics g){
        g.drawString("seconde: "+seconde,30,30);
        g.drawString("Minuut: " +minuut,30,45);
        g.drawString("Uur: "+uur,30,60);
        g.drawString("Dag: "+dag,30,75);
        g.drawString("Jaar: "+jaar,30,90);
    }
}
