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

    public abstract void clicDetecte(MouseEvent e);

    public abstract void clicRelache(MouseEvent e);

    public abstract void clicGlisse(MouseEvent e);
}
