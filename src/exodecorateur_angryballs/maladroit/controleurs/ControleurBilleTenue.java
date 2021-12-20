package exodecorateur_angryballs.maladroit.controleurs;

import mesmaths.geometrie.base.Vecteur;

import java.awt.event.MouseEvent;

public class ControleurBilleTenue extends ControleurEtat {
    public ControleurBilleTenue(ControleurGeneral controleurGeneral, ControleurEtat suivant) {
        super(controleurGeneral, suivant);
    }

    @Override
    public void clicDetecte(MouseEvent e) {
    }

    @Override
    public void clicRelache(MouseEvent e) {
        this.controleurGeneral.billePilotée.switchEtatActuelle();
        this.controleurGeneral.billePilotée = null;
        this.controleurGeneral.setControleurCourant(this.controleurGeneral.controleurBilleLibre);
    }

    @Override
    public void clicGlisse(MouseEvent e) {
        this.controleurGeneral.billePilotée.setPositionSouris(new Vecteur(e.getX(), e.getY()));
    }

}