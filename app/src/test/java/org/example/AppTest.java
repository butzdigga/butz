package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void siebenIstPrimzahl() {
        assertTrue(App.istPrimzahl(7));
    }

    @Test
    void fuenfzehnIstKeinePrimzahl() {
        assertFalse(App.istPrimzahl(15));
    }

    @Test
    void siebenundneunzigIstPrimzahl() {
        assertTrue(App.istPrimzahl(97));
    }
        @Test
    void siebennaechsteprimzahl() {
        assertTrue(App.naechstePrimzahl(7)==7);
    }
        @Test
    void fuenfzehnnaechsteprimzahl() {
        assertTrue(App.naechstePrimzahl(15)==17);
    }
        @Test
    void siebenundneunzignaechsteprimzahl() {
        assertTrue(App.naechstePrimzahl(97)==101);
    }




}
