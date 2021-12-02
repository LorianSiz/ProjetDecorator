package exodecorateur_angryballs.maladroit.controleurs;

import java.awt.event.MouseEvent;

public abstract class ControleurEtat{
    ControleurGeneral controleurGeneral;
    public ControleurEtat suivant;

    public ControleurEtat(ControleurGeneral controleurGeneral, ControleurEtat suivant){
        super();
        this.controleurGeneral = controleurGeneral;
        this.suivant = suivant;
    }

    public void traite(int x, int y){
        System.out.println("Apelle de traite Cas general");
        traiteCasGeneral(x,y);
    }

    protected abstract void traiteCasGeneral(int x,int y);

    public abstract void clicDetecte(MouseEvent e);

    public abstract void clicRelache(MouseEvent e);

    public abstract void clicGlisse(MouseEvent e);
}
