/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoTest;

import static dao.SkieurDao.getListeSkieurs;
import domaine.Pays;
import java.util.ArrayList;
import org.testng.annotations.Test;

/**
 *
 * @author maret
 */
public class SkieurDaoTest {
    
    @Test
    public void testgetListeSkieurs() {
        Pays p = new Pays("CH");
        try {
            ArrayList aLst = getListeSkieurs(p);
        } catch (Exception e) {
            System.err.println("ListeSkieurs not get");
        }
        
    }
    
}
