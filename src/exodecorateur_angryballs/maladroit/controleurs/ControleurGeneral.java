package exodecorateur_angryballs.maladroit.controleurs;

import exodecorateur_angryballs.maladroit.modele.Bille;
import exodecorateur_angryballs.maladroit.modele.DecoBille;
import exodecorateur_angryballs.maladroit.modele.DecoBillePilot�e;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

public class ControleurGeneral implements MouseListener, MouseMotionListener { //Contr�leur g�n�ral du state

    Vector<Bille> listeBilles;
    DecoBillePilot�e billePilot�e;

    ControleurBilleLibre controleurBilleLibre;
    ControleurBilleTenue controleurBilleTenue;
    ControleurEtat controleurCourant;

    public ControleurGeneral(Vector<Bille> listeBilles){
        this.listeBilles = listeBilles;
        this.controleurBilleLibre = new ControleurBilleLibre(this,null);
        this.controleurBilleTenue = new ControleurBilleTenue(this,null);

        this.controleurBilleTenue.suivant = this.controleurBilleLibre;
        this.controleurBilleLibre.suivant = this.controleurBilleTenue;

        this.controleurCourant = this.controleurBilleLibre;
    }

    public boolean testBilleAttrapee(Vecteur positionClique) {
        for (Bille bille:
                this.listeBilles) {
            while (bille instanceof DecoBille) {
                if (bille.getClass() == DecoBillePilot�e.class)
                    if (Geop.appartientDisque(positionClique, bille.getPosition(), bille.getRayon())){
                        this.billePilot�e = (DecoBillePilot�e) bille;
                        return true;
                    }
                bille = ((DecoBille) bille).getBilleD�cor�e();
            }
        }
        return false;
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