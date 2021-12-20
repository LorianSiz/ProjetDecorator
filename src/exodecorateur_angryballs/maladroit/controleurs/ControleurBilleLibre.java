package exodecorateur_angryballs.maladroit.controleurs;

import mesmaths.geometrie.base.Vecteur;

import java.awt.event.MouseEvent;

public class ControleurBilleLibre extends ControleurEtat {

    public ControleurBilleLibre(ControleurGeneral controleurGeneral, ControleurEtat suivant) {
        super(controleurGeneral, suivant);
    }

    @Override
    public void clicDetecte(MouseEvent e) {
        Vecteur positionSouris = new Vecteur(e.getX(), e.getY());
        if(this.controleurGeneral.testBilleAttrapee(positionSouris)) {
            this.controleurGeneral.billePilot�e.switchEtatActuelle();
            this.controleurGeneral.billePilot�e.setPositionSouris(positionSouris);
            this.controleurGeneral.setControleurCourant(this.controleurGeneral.controleurBilleTenue);
        }
    }

    @Override
    public void clicRelache(MouseEvent e) {

    }

    @Override
    public void clicGlisse(MouseEvent e) {

    }

}