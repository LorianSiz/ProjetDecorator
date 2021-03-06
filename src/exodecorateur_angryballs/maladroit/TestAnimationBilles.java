package exodecorateur_angryballs.maladroit;

import java.awt.Color;
import java.io.IOException;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.Bille;
import exodecorateur_angryballs.maladroit.modele.BilleNormal;
import exodecorateur_angryballs.maladroit.modele.DecoMvtRU;
import exodecorateur_angryballs.maladroit.modele.DecoPasseMuraille;
import exodecorateur_angryballs.maladroit.vues.VueBillard;
import mesmaths.geometrie.base.Vecteur;

public class TestAnimationBilles {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Vector<Bille> billes = new Vector<Bille>();

		Vecteur centreBille1 = new Vecteur(110, 70);
		double rayonBille1 = 12;
		Vecteur vitesseBille1 = new Vecteur(10, -30);
		Bille bille1 = new DecoPasseMuraille(
				new DecoMvtRU(new BilleNormal(centreBille1, rayonBille1, vitesseBille1, Color.blue)));
		billes.add(bille1);

		Vecteur centreBille2 = new Vecteur(20, 50);
		double rayonBille2 = 15;
		Vecteur vitesseBille2 = new Vecteur(5, -5);
		Bille bille2 = new DecoPasseMuraille(
				new DecoMvtRU(new BilleNormal(centreBille2, rayonBille2, vitesseBille2, Color.blue)));
		billes.add(bille2);

		double vmax2 = AnimationBilles.maxVitessesCarrées(billes);
		double rayonmin2 = AnimationBilles.minRayons(billes);

		System.out.println("vmax2 = " + vmax2 + "rayonMin2 = " + rayonmin2);
		int c = System.in.read();

		VueBillard vueBillardFactice = new VueBillardFactice();

		AnimationBilles animation = new AnimationBilles(billes, vueBillardFactice);
		animation.lancerAnimation();
	}

}
