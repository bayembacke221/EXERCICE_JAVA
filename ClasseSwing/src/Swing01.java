import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class Swing01 extends JFrame implements MouseListener {
	public Swing01 (String titre) {
		this.setTitle (titre);
		this.setSize (250,200);
			Container contenu = this.getContentPane( );
			contenu.setBackground (Color.yellow);
			JButton bouton = new JButton ("Copier");
			bouton.setBackground (Color.green);
			contenu. add (bouton,BorderLayout.SOUTH);
			this.addMouseListener ( this );
		}
	

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println ("vous avez clique au point de coordonnes : "
		+arg0.getX()+" "+arg0.getY());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
