package exodecorateur_angryballs.maladroit.modele;

import java.util.Vector;

public class DecoMvtNewton extends DecoBille {
	public DecoMvtNewton(Bille billeDécorée) {
		super(billeDécorée);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		super.gestionAccélération(billes);
		this.getAccélération().ajoute(OutilsBille.gestionAccélérationNewton(this, billes)); // contribution de
																							// l'accélération due à
																							// l'attraction des autres
																							// billes
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
			double hauteur) {
		super.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
