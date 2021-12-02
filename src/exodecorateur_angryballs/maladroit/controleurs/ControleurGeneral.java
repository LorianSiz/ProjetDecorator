package exodecorateur_angryballs.maladroit.controleurs;

import exodecorateur_angryballs.maladroit.modele.DecoBillePilotée;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ControleurGeneral implements MouseListener, MouseMotionListener {

    DecoBillePilotée billePilotée;
    ControleurBilleLibre controleurBilleLibre;
    ControleurBilleTenue controleurBilleTenue;
    ControleurEtat controleurCourant;

    public ControleurGeneral(){
        this.installeControleurs();
    }

    private void installeControleurs(){
        this.controleurBilleLibre = new ControleurBilleLibre(this,null);
        this.controleurBilleTenue = new ControleurBilleTenue(this,null);

        this.controleurBilleTenue.suivant = this.controleurBilleLibre;
        this.controleurBilleLibre.suivant = this.controleurBilleTenue;

        this.controleurCourant = this.controleurBilleLibre;
    }

    public void setControleurCourant(ControleurEtat controleurCourant){
        this.controleurCourant = controleurCourant;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.controleurCourant.clicDetecte(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.controleurCourant.clicRelache(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.controleurCourant.clicGlisse(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}