/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaine;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author maret
 */
public class SkieurTest {
    Skieur s, s1, s2, s3, s4;
    Pays pays, pays2;
    
    @BeforeTest
    public void createSkieurs() {
        pays = new Pays("US","Etats-Unis");
        pays2 = new Pays("CH","Suisse");
        s = new Skieur(11, "fegwe", "Testn", pays);
        s1 = new Skieur(4, "fegwe", "Testn", pays2);
        s2 = new Skieur(2, "feggregwe", "Testn", pays2);
        s3 = new Skieur(7, "feggrewe", "titi", pays);
        s4 = new Skieur(11, "gagar", "saas", pays2);
    }
    
    @Test
    public void testGetNo() {
        createSkieurs();
        if (s.getNo() != 1) {System.err.println("Error getno --> Skieur");}
        if (s2.getNo() != 2) {System.err.println("Error getno --> Skieur");}

        Assert.assertNotNull(s);
        Assert.assertNotNull(s.getNo());
        Assert.assertEquals(s.getNo(), 11);
        Assert.assertEquals(s2.getNo(), 2);
        Assert.assertEquals(s3.getNo(), 7);
        Assert.assertFalse(s4.getNo() == 101);
        
    }
    
    @Test
    public void testGetNom() {
        createSkieurs();
        if (!s.getNom().equals("fegwe")) {System.err.println("Error getnom --> Skieur");}
        if (!s2.getNom().equals("feggregwe")) {System.err.println("Error getnom --> Skieur");}

        Assert.assertTrue( (s.getNom()).equals("fegwe") );
        Assert.assertEquals(s2.getNom(), "feggregwe");
        Assert.assertFalse( (s3.getNom()).equals("testettee"));

        
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

        if (s.getPays() != null) {

        } else { System.err.print("error");}
    }
        
    @Test
    public void testEquals() {
        createSkieurs();
        System.err.println(s.equals(s1)?"":"Erreur equals pays");
        System.err.println(s1.equals(s)?"":"Erreur equals pays");
        System.err.println(s1.equals(s3)?"Erreur equals pays":"");
        System.err.println(s4.equals(s3)?"Erreur equals pays":"");
        Assert.assertTrue(s.equals(s4));
        Assert.assertTrue(s4.equals(s));
        Assert.assertFalse(s3.equals(s2));
        Assert.assertFalse(s2.equals(s1));
        Assert.assertFalse(s4.equals(s2));
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

    @Test
    public void getNoTest() {
        int x = s1.getNo();
        Assert.assertEquals(x, 4);
    }
    /*
    public String getNom() { return nom; }
13	1
    public String getPrenom() { return prenom; }
14	1
    public Pays getPays() { return pays; }
15

        16	2
    public boolean equals(Object obj) { return this.no == ((Skieur)obj).no; }
17	1
    public String toString() { return prenom+" "+nom; }
*/
}