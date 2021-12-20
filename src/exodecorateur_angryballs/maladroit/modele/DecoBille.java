package exodecorateur_angryballs.maladroit.modele;

import java.awt.Color;
import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import mesmaths.mecanique.MecaniquePoint;

public abstract class DecoBille extends Bille {

	protected Bille billeDécorée;

	public DecoBille(Bille billeDécorée) {
		this.billeDécorée = billeDécorée;
	}

	@Override
	public Vecteur getPosition() {
		return this.billeDécorée.getPosition();
	}

	@Override
	public double getRayon() {
		return this.billeDécorée.getRayon();
	}

	@Override
	public Vecteur getVitesse() {
		return this.billeDécorée.getVitesse();
	}

	@Override
	public Vecteur getAccélération() {
		return this.billeDécorée.getAccélération();
	}

	@Override
	public int getClef() {
		return this.billeDécorée.getClef();
	}

	@Override
	public Color getCouleur() {
		return this.billeDécorée.getCouleur();
	}

	public Bille getBilleDécorée() {
		return this.billeDécorée;
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		this.billeDécorée.gestionAccélération(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
								 double hauteur) {
		this.billeDécorée.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
