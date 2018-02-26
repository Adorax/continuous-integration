package metier;

import domaine.Pays;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author jeremyfr.maret
 */
public class Model extends Observable{
    
    private ArrayList aLstPays = new ArrayList();
    private ArrayList aLstSkieurs = new ArrayList();
    private int paysPos;
    private static int NO_POS = -1;
    private int skiPos = NO_POS;
    public final int SKI = 0, PAYS = 1;
    
    public void loadData () {
        aLstPays = dao.PaysDao.getListePays();
        setChanged(); notifyObservers(new Action(Action.LOAD, NO_POS));
    }
    
    public int getNbPays() {
        return aLstPays.size();
    }
    
    public int getNbSkieurs() {
        return aLstSkieurs.size();
    }

    public Object getPays(int i) {
        return aLstPays.get(i);
    }

    public Object getSkieur(int i) {
        return aLstSkieurs.get(i);
    }

    public void showSkieurs(int ind) {
        paysPos = ind;
        aLstSkieurs = dao.SkieurDao.getListeSkieurs((Pays)this.getPays(paysPos));
        setChanged(); notifyObservers(new Action(Action.SEL, NO_POS));
    }

    public void showSkieur(int ind) {
        skiPos = ind;
        setChanged(); notifyObservers(new Action(Action.SEL, skiPos));
    }
    
}
