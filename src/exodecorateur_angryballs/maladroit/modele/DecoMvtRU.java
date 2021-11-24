package exodecorateur_angryballs.maladroit.modele;

import java.util.Vector;

/**
 * 
 * Bille rebondissant sur les murs et subissant un mouvement rectiligne uniforme
 * (mouvment en ligne droite � vitesse constante)
 * 
 */
public class DecoMvtRU extends DecoBille {

	public DecoMvtRU(Bille billeD�cor�e) {
		super(billeD�cor�e);
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes) {
		super.gestionAcc�l�ration(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
			double hauteur) {
		super.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}

}
