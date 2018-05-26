package domaine;

public class Pays {
    private String code;
    private String nom;
    
    public Pays(String code, String nom) { this.code=code; this.nom=nom; }
    public Pays(String code) { this(code, ""); }
    
    public String getCode() { return code; }
    public String getNom() { return nom; }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj instanceof Pays?this.code.equals(((Pays)obj).code): null; }
    public String toString() { return nom; }

    @Override
    public int hashCode() {
        int hash = 138;
        hash = hash * 17 + code.hashCode();
        hash = hash * 31 + nom.hashCode();
        return hash;

    }
}