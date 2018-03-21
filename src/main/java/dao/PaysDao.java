package dao;

import java.util.ArrayList;
import java.util.StringTokenizer;
//import outils.FileStr;
import domaine.Pays;

public class PaysDao {

    private static final String FICHIER_PAYS = "Pays.txt";

    public static ArrayList getListePays() {
        String[] tabPays = new String[3]; //FileStr.read(FICHIER_PAYS);
        tabPays[0] = "ok";
        /*ArrayList aLst = new ArrayList();
        for (int i=0; i<tabPays.length; i++) {
            StringTokenizer strTPays = new StringTokenizer(tabPays[i], ";");
            aLst.add(new Pays(strTPays.nextToken(), strTPays.nextToken()));
        }*/
        return new ArrayList();//aLst;
    }
}
