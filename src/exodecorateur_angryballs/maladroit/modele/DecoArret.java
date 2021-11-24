package exodecorateur_angryballs.maladroit.modele;

import java.util.Vector;

import mesmaths.cinematique.Collisions;

/**
 * 
 * Bille s'arrêtant sur les bords et subissant l'attraction des autres billes
 * 
 */

public class DecoArret extends DecoBille {

	public DecoArret(Bille billeDécorée) {
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
		Collisions.collisionBilleContourAvecArretHorizontal(this.getPosition(), this.getRayon(), this.getVitesse(),
				abscisseCoinHautGauche, largeur);
		Collisions.collisionBilleContourAvecArretVertical(this.getPosition(), this.getRayon(), this.getVitesse(),
				ordonnéeCoinHautGauche, hauteur);
	}

}
