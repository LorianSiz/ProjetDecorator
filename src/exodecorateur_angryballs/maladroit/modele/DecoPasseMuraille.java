package exodecorateur_angryballs.maladroit.modele;

import java.util.Vector;

import mesmaths.cinematique.Collisions;

/**
 * 
 * Bille traversant les murs et subissant un mouvement rectiligne uniforme
 * (mouvment en ligne droite à vitesse constante)
 * 
 */

public class DecoPasseMuraille extends DecoBille {

	public DecoPasseMuraille(Bille billeDécorée) {
		super(billeDécorée);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		this.billeDécorée.gestionAccélération(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
			double hauteur) {
		this.billeDécorée.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
		Collisions.collisionBilleContourPasseMuraille(this.getPosition(), abscisseCoinHautGauche,
				ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
