/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import org.testng.annotations.Test;

/**
 *
 * @author maret
 */
public class ModelTest {
    
    Model m;
    
    @Test
    public void testLoadD() {
        m = new Model();
        m.loadData();
    }
    
    @Test
    public void getPaysModel() {
        testLoadD();
        m.getNbPays();
        if (m.getNbPays() < 1) {System.err.println("Don't get pays");}
        m.getPays(1);
        m.getPays(3);
        m.getPays(m.getNbPays() - 1 );

    }
    
    @Test
    public void getSkiModel() {
        testLoadD();
        m.getNbSkieurs();                
        m.showSkieurs(2);
        m.getSkieur(2);
    }
    
    @Test
    public void ShowTest() {
        testLoadD();
        m.showSkieur(3);
        m.showSkieur(2);
    }
    
    @Test
    public void CopyTest() {
        testLoadD();
        m.copyName("toto");
    }
        
    
}
