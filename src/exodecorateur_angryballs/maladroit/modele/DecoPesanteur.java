package exodecorateur_angryballs.maladroit.modele;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

public class DecoPesanteur extends DecoBille {
	Vecteur pesanteur;

	public DecoPesanteur(Bille billeDécorée, Vecteur pesanteur) {
		super(billeDécorée);
		this.pesanteur = pesanteur;
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		super.gestionAccélération(billes);
		this.getAccélération().ajoute(this.pesanteur); // contribution du champ de pesanteur (par exemple)
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
			double hauteur) {
		super.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
