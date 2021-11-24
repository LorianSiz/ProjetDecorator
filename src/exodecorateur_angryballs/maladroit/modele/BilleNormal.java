package exodecorateur_angryballs.maladroit.modele;

import java.awt.Color;

import mesmaths.geometrie.base.Vecteur;

public class BilleNormal extends Bille {

	public Vecteur position; // centre de la bille
	public double rayon; // rayon > 0
	public Vecteur vitesse;
	public Vecteur acc�l�ration;
	public int clef; // identifiant unique de cette bille

	protected Color couleur;

	/**
	 * @param centre
	 * @param rayon
	 * @param vitesse
	 * @param acc�l�ration
	 * @param couleur
	 */
	protected BilleNormal(Vecteur centre, double rayon, Vecteur vitesse, Vecteur acc�l�ration, Color couleur) {
		this.position = centre;
		this.rayon = rayon;
		this.vitesse = vitesse;
		this.acc�l�ration = acc�l�ration;
		this.couleur = couleur;
		this.clef = Bille.prochaineClef++;
	}

	/**
	 * @param position
	 * @param rayon
	 * @param vitesse
	 * @param couleur
	 */
	public BilleNormal(Vecteur position, double rayon, Vecteur vitesse, Color couleur) {
		this(position, rayon, vitesse, new Vecteur(), couleur);
	}

	/**
	 * @return the position
	 */
	@Override
	public Vecteur getPosition() {
		return this.position;
	}

	/**
	 * @return the rayon
	 */
	@Override
	public double getRayon() {
		return this.rayon;
	}

	/**
	 * @return the vitesse
	 */
	@Override
	public Vecteur getVitesse() {
		return this.vitesse;
	}

	/**
	 * @return the acc�l�ration
	 */
	@Override
	public Vecteur getAcc�l�ration() {
		return this.acc�l�ration;
	}

	/**
	 * @return the clef
	 */
	@Override
	public int getClef() {
		return this.clef;
	}

	/**
	 * @return the couleur
	 */
	@Override
	public Color getCouleur() {
		return this.couleur;
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
			double hauteur) {
	}
}
