package h803;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H803 extends Applet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField tekstvak;				
    Button knop;
	
    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("ok");
        knop.addActionListener( new KnopListener() );
        add (tekstvak);
        add(knop);
    }

    
   
    public void paint(Graphics g) {
        g.drawString("Type tekst " +
           "in het tekstvakje " +
           "en klik op ok of reset", 200, 20 );
    }
	
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Jammer, " +
                "maar nu staat er iets anders");
            repaint();
        }
    }
}
