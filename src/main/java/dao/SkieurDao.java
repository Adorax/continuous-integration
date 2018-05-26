package dao;

import java.util.ArrayList;


import domaine.Skieur;
import domaine.Pays;

public class SkieurDao {
    

    private SkieurDao(){};
    public static ArrayList getListeSkieurs(Pays pays) {
        String[] tabSkieurs = new String[3];

        ArrayList aLst = new ArrayList();

         aLst.add(new Skieur(1, "fegwe", "Testn", pays));aLst.add(new Skieur(1, "dw", "fergreg", pays));
         aLst.add(new Skieur(1, "fergre", "Testn", pays));aLst.add(new Skieur(1, "cyxccxy", "cy", pays));
         aLst.add(new Skieur(1, "feggregwe", "Testn", pays));aLst.add(new Skieur(1, "sqwssa", "dasyxcs", pays));
         aLst.add(new Skieur(1, "fefe", "tutu", pays));aLst.add(new Skieur(1, "gagar", "saas", pays));         
         aLst.add(new Skieur(1, "feggrewe", "titi", pays));aLst.add(new Skieur(1, "eoeoeo", "rgaeresg", pays));
         
        return aLst;
    }   
}

//FileStr.read(FICHIER_SKIEURS);
//import java.util.StringTokenizer;
//import outils.FileStr;
//private static final String FICHIER_SKIEURS = "Skieurs.txt";

//tabSkieurs[0] = "kookokokokojfo";

         /*for (int i=0; i<tabSkieurs.length; i++) {
            StringTokenizer strT = new StringTokenizer(tabSkieurs[i], ";");
            Pays p = new Pays(strT.nextToken());
            if (p.equals(pays)) { aLst.add(new Skieur(Integer.parseInt(strT.nextToken()), strT.nextToken(), strT.nextToken(), pays)); }
        }*/