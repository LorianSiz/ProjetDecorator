package exodecorateur_angryballs.maladroit.modele;

import mesmaths.geometrie.base.Vecteur;
import java.util.Vector;

public class DecoBillePilot�e extends DecoBille {

    private Vecteur positionSouris;
    private Vecteur anciennePosition; //WIP
    private boolean etatActuelle;

    public DecoBillePilot�e(Bille billeD�cor�e) {
        super(billeD�cor�e);
        this.etatActuelle = false;
        this.anciennePosition = new Vecteur(0,0);
    }

    public Vecteur getPositionSouris() {
        return positionSouris;
    }

    public boolean isEtatActuelle() {
        return etatActuelle;
    }

    public void switchEtatActuelle() { this.etatActuelle =  !this.etatActuelle; }

    public void setPositionSouris(Vecteur positionSouris) {
        this.positionSouris = positionSouris;
    }

    public void setEtatActuelle(boolean etatActuelle) {
        this.etatActuelle = etatActuelle;
    }

    @Override
    public void gestionAcc�l�ration(Vector<Bille> billes) {
        super.gestionAcc�l�ration(billes);
        if(etatActuelle) this.getAcc�l�ration().ajoute(this.accelerationElastique());
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonn�eCoinHautGauche, double largeur,
                                 double hauteur) {
        super.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche, largeur, hauteur);
    }

    public Vecteur accelerationElastique() {
        Vecteur vecteurElastique = Vecteur.difference(this.positionSouris, this.getPosition());
        double coef = vecteurElastique.norme() * 0.1;
        vecteurElastique.multiplie(1/this.masse());
        vecteurElastique.multiplie(coef);

        /*Vecteur temp = vecteurElastique;
        vecteurElastique = temp.difference(this.anciennePosition);
        this.anciennePosition = temp;*/

        return vecteurElastique;
    }

}