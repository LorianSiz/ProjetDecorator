package exodecorateur_angryballs.maladroit.modele;

import mesmaths.geometrie.base.Vecteur;
import java.util.Vector;

public class DecoBillePilotée extends DecoBille {

    private Vecteur accélérationSouris;

    public DecoBillePilotée(Bille billeDécorée) {
        super(billeDécorée);
        this.accélérationSouris = new Vecteur();
    }

    public void setAccélérationSouris(Vecteur accélérationSouris) {
        this.accélérationSouris = accélérationSouris;
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        super.gestionAccélération(billes);
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
                                 double hauteur) {
        super.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
    }

}