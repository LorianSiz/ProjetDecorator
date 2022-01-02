package exodecorateur_angryballs.maladroit.modele;

import mesmaths.geometrie.base.Vecteur;
import java.util.Vector;

public class DecoBillePilotée extends DecoBille { //Décorateur pour le "pilotage" de la bille

    private Vecteur positionSouris;
    private boolean etatActuelle;

    public DecoBillePilotée(Bille billeDécorée) {
        super(billeDécorée);
        this.etatActuelle = false;
    }

    public void switchEtatActuelle() { this.etatActuelle =  !this.etatActuelle; }

    public void setPositionSouris(Vecteur positionSouris) {
        this.positionSouris = positionSouris;
    }

    @Override
    public void gestionAccélération(Vector<Bille> billes) {
        super.gestionAccélération(billes);
        if(etatActuelle) this.getAccélération().ajoute(this.accelerationElastique()); //Détermine si la bille a besoin d'être élastique ou non
    }

    @Override
    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinHautGauche, double largeur,
                                 double hauteur) {
        super.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur, hauteur);
    }

    public Vecteur accelerationElastique() { //Permet à la bille d'être élastique par rapport à la souris
        Vecteur vecteurElastique = Vecteur.difference(this.positionSouris, this.getPosition());
        double coef = vecteurElastique.norme() * 0.1;
        vecteurElastique.multiplie(1/this.masse());
        vecteurElastique.multiplie(coef);

        return vecteurElastique;
    }

}