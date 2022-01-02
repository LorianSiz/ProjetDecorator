package exodecorateur_angryballs.maladroit.modele;

import mesmaths.geometrie.base.Vecteur;
import java.util.Vector;

public class DecoBillePilot�e extends DecoBille { //D�corateur pour le "pilotage" de la bille

    private Vecteur positionSouris;
    private boolean etatActuelle;

    public DecoBillePilot�e(Bille billeD�cor�e) {
        super(billeD�cor�e);
        this.etatActuelle = false;
    }

    public void switchEtatActuelle() { this.etatActuelle =  !this.etatActuelle; }

    public void setPositionSouris(Vecteur positionSouris) {
        this.positionSouris = positionSouris;
    }

    @Override
    public void gestionAcc�l�ration(Vector<Bille> billes) {
        super.gestionAcc�l�ration(billes);
        if(etatActuelle) this.getAcc�l�ration().ajoute(this.accelerationElastique()); //D�termine si la bille a besoin d'�tre �lastique ou non
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
                                 double hauteur) {
        super.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
    }

    public Vecteur accelerationElastique() { //Permet � la bille d'�tre �lastique par rapport � la souris
        Vecteur vecteurElastique = Vecteur.difference(this.positionSouris, this.getPosition());
        double coef = vecteurElastique.norme() * 0.1;
        vecteurElastique.multiplie(1/this.masse());
        vecteurElastique.multiplie(coef);

        return vecteurElastique;
    }

}