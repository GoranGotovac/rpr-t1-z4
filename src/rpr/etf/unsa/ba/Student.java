package rpr.etf.unsa.ba;

public class Student {
    public String ime, prezime;
    public int index;
    public Student(String ime, String prezime, int index) {Postavi(ime,prezime,index);}
    public void Postavi(String ime, String prezime, int index) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
    }
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getIndex() {
        return index;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public String toString(){
            return this.prezime + " " + this.ime + " (" + this.index + ")";
    }
}
