package rpr.etf.unsa.ba;

public class Predmet<a> {
    public String naziv;
    private Student[] a;
    public int sifra, br_predmeta;
    public Predmet( String naz, int sif, int br_pred) {Postavi(naz,sif,br_pred);}
    public void Postavi(String naziv, int sifra, int br_predmeta) {
        this.naziv = naziv;
        this.sifra = sifra;
        this.br_predmeta = br_predmeta;
        a = new Student[br_predmeta];
    }
    public void setSifra(int a) {
        sifra = a;
    }
    public void setNaziv(String a){
        naziv = a;
    }
    public String getNaziv() {
        return naziv;
    }
    public int getSifra() {
        return sifra;
    }
    public  void upisi(Student s) {
        for(int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                a[i] = s;
                break;
            }
        }
    }
    public void ispisi(Student s) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == s) {
                a[i] = null;
                break;
            }
        }
        for(int i = 0; i < a.length; i++) {
            if(a[i] == null && i != a.length - 1) {
                a[i] = a[i+1];
                a[i+1] = null;
            }
        }
    }
    public void ispisi() {
        int i;
        for(i = 0; i < a.length; i++) {
            if(a[i] == null){
                break;
            }
            System.out.print(i + 1+". ");
            System.out.println(a[i]);
        }
    }
}
