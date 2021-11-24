package exodecorateur_angryballs.maladroit.modele;

import mesmaths.geometrie.base.Vecteur;
import java.util.Vector;

public class DecoBillePilot�e extends DecoBille {

    private Vecteur acc�l�rationSouris;

    public DecoBillePilot�e(Bille billeD�cor�e) {
        super(billeD�cor�e);
        this.acc�l�rationSouris = new Vecteur();
    }

    public void setAcc�l�rationSouris(Vecteur acc�l�rationSouris) {
        this.acc�l�rationSouris = acc�l�rationSouris;
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