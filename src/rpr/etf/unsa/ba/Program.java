package rpr.etf.unsa.ba;

public class Program {
    String d,e,f;
    public static void main(String[] args) {
    Predmet a = new Predmet ("Matematka", 55, 6);
    Student b = new Student ("Goran", "Gotovac",17531);
    Student c = new Student ("Sara","Saric", 12345);
    Student d = new Student ("Pero", "Peric", 12324);
    a.upisi(b);
    a.upisi(c);
    a.upisi(d);
    System.out.println(b);
    a.ispisi(d);
    a.ispisi();
    System.out.println(a);
    }
}
