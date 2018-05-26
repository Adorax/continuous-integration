package domaine;

public class Skieur {
    private int no;
    private String nom;
    private String prenom;
    private Pays pays;
    
    public Skieur(int no, String nom, String prenom, Pays pays) { this.no=no; this.nom=nom; this.prenom=prenom; this.pays=pays; }
    
    public int getNo() { return no; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public Pays getPays() { return pays; }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj instanceof Skieur?this.no == ((Skieur)obj).no: null; }
    public String toString() { return prenom+" "+nom; }

    @Override
    public int hashCode() {
        int hash = 8;
        hash = hash * 17 + no;
        hash = hash * 11 + prenom.hashCode();
        hash = hash * 31 + nom.hashCode();
        hash = hash * 8 + pays.hashCode();
        return hash;
    }
}