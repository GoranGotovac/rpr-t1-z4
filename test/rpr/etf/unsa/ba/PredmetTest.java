package rpr.etf.unsa.ba;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    class PredmetTest {
    @Test
    void setSifra() {
        Predmet p = new Predmet("RPR", 111,14);
        p.setSifra(143);
        assertEquals(143, p.getSifra());
    }

    @Test
    void setNaziv() {
        Predmet p = new Predmet("RPR", 111,14);
        p.setNaziv("SIS");
        assertEquals("SIS", p.getNaziv());
    }

    @Test
    void upisi() {
        String rpr = "RPR";
        Predmet p = new Predmet(rpr, 111,14);
        assertAll("predmet",
                () -> assertEquals(rpr, p.getNaziv()),
                () -> assertEquals(111, p.getSifra()));
    }

    @Test
    void ispisi() {
    }

    @Test
    void ispisi1() {
    }

}