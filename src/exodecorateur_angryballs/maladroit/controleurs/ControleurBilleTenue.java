package exodecorateur_angryballs.maladroit.controleurs;

import java.awt.event.MouseEvent;

public class ControleurBilleTenue extends ControleurEtat {
    public ControleurBilleTenue(ControleurGeneral controleurGeneral, ControleurEtat suivant) {
        super(controleurGeneral, suivant);
    }

    @Override
    protected void traiteCasGeneral(int x, int y) {
        //Vecteur positionSouris = new Vecteur(x, y);
//        int xMinBille = (int) (controleurGeneral.billeState.getPosition().x - controleurGeneral.billeState.getRayon());
//        int xMaxBille = (int) (controleurGeneral.billeState.getPosition().x + controleurGeneral.billeState.getRayon());
//        int yMinBille = (int) (controleurGeneral.billeState.getPosition().y - controleurGeneral.billeState.getRayon());
//        int yMaxBille = (int) (controleurGeneral.billeState.getPosition().y - controleurGeneral.billeState.getRayon());
//        if(xMinBille < x && x < xMaxBille){
//            if(yMinBille < y && y < yMaxBille){
//                System.out.println("Clique sur la bille");
//            }
//        }
    }

    protected void traiteBilleAttrapee(int x, int y){

    }

    @Override
    public void clicDetecte(MouseEvent e) {

    }

    @Override
    public void clicRelache(MouseEvent e) {
        this.controleurGeneral.setControleurCourant(this.controleurGeneral.controleurBilleLibre);
    }

    @Override
    public void clicGlisse(MouseEvent e) {

    }

}