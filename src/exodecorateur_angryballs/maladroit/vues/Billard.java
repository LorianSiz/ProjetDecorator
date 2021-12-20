package exodecorateur_angryballs.maladroit.vues;

import java.awt.*;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;

/**
 * responsable du dessin des billes
 * 
 * ICI : IL N'Y A RIEN A CHANGER
 * 
 * 
 */
public class Billard extends Canvas {
	Vector<Bille> billes;

	public Billard(Vector<Bille> billes) {
		this.billes = billes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Canvas#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics graphics) {
		int i;

		for (i = 0; i < this.billes.size(); ++i)
			this.billes.get(i).dessine(graphics);

		// System.out.println("billes dans le billard = " + billes);
	}

	@Override
	public void update(Graphics graphics) {
		Graphics APgraphics; //Charge les graphiques en arrière-plan
		Image APscreen; //Charge la fenêtre en arrière-plan
		Dimension d = getSize(); //Dimension de la fenêtre

		APscreen = createImage(d.width, d.height);
		APgraphics = APscreen.getGraphics();
		paint(APgraphics);
		graphics.drawImage(APscreen, 0, 0, this);
	}

}
