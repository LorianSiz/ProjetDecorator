package exodecorateur_angryballs.maladroit.modele;

import java.awt.Color;
import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import mesmaths.mecanique.MecaniquePoint;

public abstract class DecoBille extends Bille {

	protected Bille billeD�cor�e;

	public DecoBille(Bille billeD�cor�e) {
		this.billeD�cor�e = billeD�cor�e;
	}

	@Override
	public Vecteur getPosition() {
		return this.billeD�cor�e.getPosition();
	}

	@Override
	public double getRayon() {
		return this.billeD�cor�e.getRayon();
	}

	@Override
	public Vecteur getVitesse() {
		return this.billeD�cor�e.getVitesse();
	}

	@Override
	public Vecteur getAcc�l�ration() {
		return this.billeD�cor�e.getAcc�l�ration();
	}

	@Override
	public int getClef() {
		return this.billeD�cor�e.getClef();
	}

	@Override
	public Color getCouleur() {
		return this.billeD�cor�e.getCouleur();
	}

	public Bille getBilleD�cor�e() {
		return this.billeD�cor�e;
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes) {
		this.billeD�cor�e.gestionAcc�l�ration(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
								 double hauteur) {
		this.billeD�cor�e.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
	}

}
