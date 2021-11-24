package exodecorateur_angryballs.maladroit.modele;

import java.util.Vector;

public class DecoMvtNewton extends DecoBille {
	public DecoMvtNewton(Bille billeD�cor�e) {
		super(billeD�cor�e);
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes) {
		this.billeD�cor�e.gestionAcc�l�ration(billes);
		this.getAcc�l�ration().ajoute(OutilsBille.gestionAcc�l�rationNewton(this, billes)); // contribution de
																							// l'acc�l�ration due �
																							// l'attraction des autres
																							// billes
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
			double hauteur) {
		this.billeD�cor�e.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}

}
