/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Pays;
import java.util.ArrayList;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 *
 * @author maret
 */
public class SkieurDaoTest {
    
    @Test
    public void testgetListeSkieurs() {
        Pays p = new Pays("CH");
        ArrayList aLst = new ArrayList();
        try {
            aLst = dao.SkieurDao.getListeSkieurs(p);
        } catch (Exception e) {
            System.err.println("ListeSkieurs not get");
        }
        Assert.assertEquals(aLst.size(), 10);
        
    }

    
}
