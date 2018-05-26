package vue;

import domaine.Skieur;
import java.awt.List;
import java.awt.TextField;
import java.util.Observable;
import java.util.Observer;
import metier.Action;
import metier.Model;

/**
 *
 * @author jeremyfr.maret
 */
public class ListObserver implements Observer{
    
    private java.awt.List listPays;
    private java.awt.List list;
    private java.awt.TextField tfNo;
    private java.awt.TextField tfNom;
    private java.awt.TextField tfPays;
    private java.awt.TextField tfPrenom;
    
    

    public ListObserver(List listPays, List list, TextField tfNo, TextField tfNom, TextField tfPays, TextField tfPrenom) {
        this.listPays = listPays; this.list = list; this.tfNo = tfNo; this.tfNom = tfNom; this.tfPays = tfPays; this.tfPrenom = tfPrenom; 
    }
    
    
    @Override
    public void update(Observable o, Object arg) {
        Model m = (Model) o;
         if( (((Action)arg).getAction()) == Action.LOAD){
            listPays.removeAll();
             for (int i=0; i < m.getNbPays(); i++) {
                listPays.add(m.getPays(i).toString());  
            }
         } else if ((((Action)arg).getAction()) == Action.SEL) {
            int pos = (((Action)arg).getPos());
            if ( pos < 0) {
                list.removeAll();
                for (int i=0; i < m.getNbSkieurs(); i++) {
                    list.add(m.getSkieur(i).toString()); 
                }
            } else {
                Skieur s = (Skieur)m.getSkieur(pos);
                tfNo.setText(Integer.toString(s.getNo()));
                tfNom.setText((s.getNom())); 
                tfPays.setText((s.getPays()).toString()); 
                tfPrenom.setText((s.getPrenom()));                                    
            }
            
         }
    }
    
}
