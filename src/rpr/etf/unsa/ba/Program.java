package rpr.etf.unsa.ba;

public class Program {
    String d,e,f;
    public static void main(String[] args) {
    Predmet a = new Predmet ("Matematka", 55, 6);
    Student b = new Student ("Goran", "Gotovac",17531);
    Student c = new Student ("Bla","Blaaaa", 12345);
    Student d = new Student ("banana", "bananica", 12324);
    a.upisi(b);
    a.upisi(c);
    a.upisi(d);
    System.out.println(b);
    a.ispisi(d);
    a.ispisi();
    a=null;
    }
}
