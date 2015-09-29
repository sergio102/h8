package h802;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H802 extends Applet	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button mButton;
	Button vButton;
	Button mlButton;
	Button vlButton;
	int man;
	int vrouw;
	int vrouwl;
	int manl;
	int totaal;
	
	public void init () {
		setSize(500, 400);
		
		mButton = new Button("Man");
		add(mButton);
		mButton.addActionListener(new  ManKnopLuisteraar());
		
		
		vButton = new Button("Vrouw");
		add(vButton);
		vButton.addActionListener(new  VrouwKnopLuisteraar());
		
		mlButton = new Button("Man LL");
		add(mlButton);
		mlButton.addActionListener(new  ManLLKnopLuisteraar());
		
		vlButton = new Button("Vrouw LL");
		add(vlButton);
		vlButton.addActionListener(new  VrouwLLKnopLuisteraar());
		
		man = 0;
		vrouw = 0;
		vrouwl = 0;
		manl = 0;
		totaal = 0;
				
	}
	public void paint(Graphics g) {
		
	int x = 50;
	int y = 70;
	g.drawString("Aantal mannen:" + man, x, y);
	y = y + 20;
	g.drawString("Aantal vrouwen:" + vrouw, x, y);
	y = y + 20;
	g.drawString("Aantal mannenlijke leerlingen: " + manl, x, y);
	y = y + 20;
	g.drawString("Aantal vrouwlijke leerlingen: " + vrouwl, x, y);
	y = y + 20;
	g.drawString("Totaal: "+ totaal, x, y);
	
	}
	
	class ManKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		man++;
		totaal++;
		repaint();
			
		}
		
	}
	class VrouwKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			vrouw++;
			totaal++;
			repaint();	
			
		}}
	class VrouwLLKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			vrouwl++;
			totaal++;
			repaint();	
			
		}}
	class ManLLKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			manl++;
			totaal++;
			repaint();	
	
	
	
	
	
	
	
}}
}

