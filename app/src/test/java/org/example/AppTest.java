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
}
