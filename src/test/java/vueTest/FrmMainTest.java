package vueTest;


import domaine.Pays;
import domaine.Skieur;
import java.util.ArrayList;
import metier.Action;
import metier.Model;
import org.testng.annotations.Test;
import vue.FrmMain;

public class FrmMainTest {

    @Test
    public void createFrm() {
        FrmMain f = new FrmMain();
    }
    
    @Test
    public void createAction() {
        Action a = new Action(Action.ADD, -1);
        Action a2 = new Action(Action.SEL, -1);
        Action a3 = new Action(Action.DEL);
        Action a4 = new Action(Action.LOAD);
        
    }
    
    @Test
    public void testModel() {
        Model m = new Model();
        m.loadData();
        m.getNbPays();
        //m.getPays(1);m.getPays(3);m.getPays(m.getNbPays() - 1 );
    }
    
    @Test
    public void testDomain() {
        Pays p = new Pays("t");
        Pays p1 = new Pays("t", "toto");
        Skieur s = new Skieur(1, "ok", "ko", p1);
        p.getCode();
        p.toString();
        s.getNom();
        
    }
    
    @Test
    public void testDao() {
        Pays p1 = new Pays("p", "toto");
        ArrayList alstP = dao.PaysDao.getListePays();
        ArrayList alstS = dao.SkieurDao.getListeSkieurs(p1);
        
    }
    
}
