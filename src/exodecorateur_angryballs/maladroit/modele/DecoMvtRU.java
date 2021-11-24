package exodecorateur_angryballs.maladroit.modele;

import java.util.Vector;

/**
 * 
 * Bille rebondissant sur les murs et subissant un mouvement rectiligne uniforme
 * (mouvment en ligne droite à vitesse constante)
 * 
 */
public class DecoMvtRU extends DecoBille {

	public DecoMvtRU(Bille billeDécorée) {
		super(billeDécorée);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		super.gestionAccélération(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
			double hauteur) {
		super.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
