package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PlainPaper extends JFrame {
	
	{
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);
	}
	
	public PlainPaper() {
		addMouseListener(new OnClickListener());
		setVisible(true);
	}
	
	public class OnClickListener extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent event) {
			super.mousePressed(event);
			if(event.getClickCount() > 1)
				System.exit(0);
		}
		
	}

}