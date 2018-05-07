package dao;

import java.util.ArrayList;
import java.util.StringTokenizer;
//import ch.adorax.libjava;
import domaine.Pays;

public class PaysDao {

    private static final String FICHIER_PAYS = "Pays.txt";

    public static ArrayList getListePays() {
        String[] tabPays = new String[3]; 
        //FileStr.read("2");
        //outils.FileStr.read(FICHIER_PAYS);
        tabPays[0] = "ok";
        ArrayList aLst = new ArrayList();
        /*for (int i=0; i<tabPays.length; i++) {
            StringTokenizer strTPays = new StringTokenizer(tabPays[i], ";");
            aLst.add(new Pays(strTPays.nextToken(), strTPays.nextToken()));
        }*/
        aLst.add(new Pays("CH","Suisse"));aLst.add(new Pays("PO","Portugal"));
        aLst.add(new Pays("FR","France"));aLst.add(new Pays("US","Etats-Unis"));
        aLst.add(new Pays("IT","Italie"));aLst.add(new Pays("TS","Tesura"));
        aLst.add(new Pays("EN","Angleterre"));aLst.add(new Pays("VM","Vermala"));
        
        return aLst;
    }
}
