/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainTest;

import domaine.Pays;
import org.testng.annotations.Test;

/**
 *
 * @author maret
 */
public class PaysTest {
    Pays p, p1, p2, p3, p4;
    
    @Test
    public void createPays() {
        p = new Pays("CH");
        p1 = new Pays("CH", "Suisse");
        p2 = new Pays("FR","France");
        p3 = new Pays("EN","Angleterre");
        p4 = new Pays("US","Etats-Unis");
    }
    
    @Test
    public void testGetCode() {
        createPays();
        if (!p.getCode().equals("CH")) {System.err.println("Error getcode --> Pays");}
        if (!p2.getCode().equals("FR")) {System.err.println("Error getcode --> Pays");}
        
    }
    
    @Test
    public void testGetNom() {
        createPays();
        if (!p.getNom().equals("")) {System.err.println("Error getcode --> Pays");}
        if (!p2.getNom().equals("France")) {System.err.println("Error getcode --> Pays");}
        
    }
    
    
    @Test
    public void testEqualsPays() {
        createPays();
        System.err.println(p.equals(p1)?"":"Erreur equals pays");
        System.err.println(p1.equals(p)?"":"Erreur equals pays");
        System.err.println(p1.equals(p3)?"Erreur equals pays":"");
        System.err.println(p4.equals(p3)?"Erreur equals pays":"");
    }
    
    @Test
    public void testToStringPays() {
        createPays();
        p4.toString();
        p.toString();
        p1.toString();
        p2.toString();
        p3.toString();
    }

}
