package vue;


import domaine.Pays;
import domaine.Skieur;
import java.util.ArrayList;
import metier.Action;
import metier.Model;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrmMainTest {
    
    private FrmMain f;
    
    @BeforeTest
    public void createFrm() { f = new FrmMain();
    }
    
    @BeforeTest
    public void createAction() {
        Action a = new Action(Action.ADD, -1);
        Action a2 = new Action(Action.SEL, -1);
        Action a3 = new Action(Action.DEL);
        Action a4 = new Action(Action.LOAD);
        assertThat(a).isNotNull();
        assertThat(a2).isNotNull();
        assertThat(a3).isNotNull();
        assertThat(a4).isNotNull();
    }
    
    @Test 
    public void testFrmMain() {
//        createFrm();
        assertThat(f).isNotNull();
    }
    /*
    @Test
    public void testModel() {
        Model m = new Model();
        m.loadData();
        int x = m.getNbPays();
        //m.getPays(1);m.getPays(3);m.getPays(m.getNbPays() - 1 );
        assertThat(x).isNotNull();
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
        
    }*/
    
}
