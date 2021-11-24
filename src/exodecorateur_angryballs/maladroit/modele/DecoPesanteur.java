package exodecorateur_angryballs.maladroit.modele;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

public class DecoPesanteur extends DecoBille {
	Vecteur pesanteur;

	public DecoPesanteur(Bille billeD�cor�e, Vecteur pesanteur) {
		super(billeD�cor�e);
		this.pesanteur = pesanteur;
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes) {
		this.billeD�cor�e.gestionAcc�l�ration(billes);
		this.getAcc�l�ration().ajoute(this.pesanteur); // contribution du champ de pesanteur (par exemple)
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
			double hauteur) {
		this.billeD�cor�e.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}

}
