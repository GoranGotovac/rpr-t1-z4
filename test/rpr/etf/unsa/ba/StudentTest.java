package rpr.etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void postavi() {
        Student d = new Student("Goran","Gotovac",17531);
        assertEquals("Gotovac Goran (17531)", d.toString());
    }

    @Test
    void getIme() {
        Student d = new Student("Goran","Gotovac",17531);
        assertEquals("Goran",d.getIme());
    }

    @Test
    void getPrezime() {
        Student d = new Student("Goran","Gotovac",17531);
        assertEquals("Gotovac",d.getPrezime());
    }

    @Test
    void getIndex() {
        Student d = new Student("Goran","Gotovac",17531);
        assertEquals(17531,d.getIndex());
    }

    @Test
    void setIme() {
        Student d = new Student("Zoran","Gotovac",17531);
        d.setIme("Goran");
        assertEquals("Goran",d.getIme());
    }

    @Test
    void setIndex() {
        Student d = new Student("Zoran","Gotovac",17531);
        d.setIndex(12345);
        assertEquals(12345,d.getIndex());
    }

    @Test
    void setPrezime() {
        Student d = new Student("Zoran","Gotovac",17531);
        d.setPrezime("Goranic");
        assertEquals("Goranic",d.getPrezime());
    }

}