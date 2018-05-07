/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainTest;

import domaine.Pays;
import domaine.Skieur;
import org.testng.annotations.Test;

/**
 *
 * @author maret
 */
public class SkieurTest {
    Skieur s, s1, s2, s3, s4;
    Pays pays, pays2;
    
    @Test
    public void createSkieurs() {
        pays = new Pays("US","Etats-Unis");
        pays2 = new Pays("CH","Suisse");
        s = new Skieur(1, "fegwe", "Testn", pays);
        s1 = new Skieur(1, "fegwe", "Testn", pays2);
        s2 = new Skieur(2, "feggregwe", "Testn", pays2);
        s3 = new Skieur(7, "feggrewe", "titi", pays);
        s4 = new Skieur(8, "gagar", "saas", pays2);   
    }
    
    @Test
    public void testGetNo() {
        createSkieurs();
        if (s.getNo() != 1) {System.err.println("Error getno --> Skieur");}
        if (s2.getNo() != 2) {System.err.println("Error getno --> Skieur");}
        
    }
    
    @Test
    public void testGetNom() {
        createSkieurs();
        if (!s.getNom().equals("fegwe")) {System.err.println("Error getnom --> Skieur");}
        if (!s2.getNom().equals("feggregwe")) {System.err.println("Error getnom --> Skieur");}
        
    }
    
    @Test
    public void testGetPrenom() {
        createSkieurs();
        if (!s.getPrenom().equals("Testn")) {System.err.println("Error getprenom --> Skieur");}
        if (!s3.getPrenom().equals("titi")) {System.err.println("Errorgetprenom --> Skieur");}
        
    }
    
    @Test
    public void testGetPays() {
        createSkieurs();
        if (!s.getPays().equals(pays)) {System.err.println("Error getpays --> Skieur");}
        if (!s2.getPrenom().equals(pays2)) {System.err.println("Errorgetpays --> Skieur");}
        
    }
        
    @Test
    public void testEqualsPays() {
        createSkieurs();
        System.err.println(s.equals(s1)?"":"Erreur equals pays");
        System.err.println(s1.equals(s)?"":"Erreur equals pays");
        System.err.println(s1.equals(s3)?"Erreur equals pays":"");
        System.err.println(s4.equals(s3)?"Erreur equals pays":"");
    }
    
    @Test
    public void testToStringPays() {
        createSkieurs();
        s4.toString();
        s.toString();
        s1.toString();
        s2.toString();
        s3.toString();
    }
}