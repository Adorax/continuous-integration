/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Pays;
import domaine.Skieur;
import java.io.FileReader;
import java.util.ArrayList;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;

/**
 *
 * @author maret
 */
public class PaysDaoTest {
    
    private PaysDao dao;
    private FileReader reader;
    private Pays pays;
    private Skieur skieur;

    
    
    @Test
    public void testgetListePays() {
        ArrayList aLst = new ArrayList();
        try {
            aLst = PaysDao.getListePays();
        } catch (Exception e) {
            System.err.println("ListeSkieurs not get");
        }
        Assert.assertEquals(aLst.size(), 8);
    }
    
    
}
