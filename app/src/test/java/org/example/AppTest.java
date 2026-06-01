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
void siebenNaechstePrimzahl() {
    assertEquals(7, App.naechstePrimzahl(7));
}

@Test
void fuenfzehnNaechstePrimzahl() {
    assertEquals(17, App.naechstePrimzahl(15));
}

@Test
void siebenundneunzigNaechstePrimzahl() {
    assertEquals(97, App.naechstePrimzahl(97));
}

@Test
void einsIstKeinePrimzahl() {
    assertFalse(App.istPrimzahl(1));
}

@Test
void nullIstKeinePrimzahl() {
    assertFalse(App.istPrimzahl(0));
}

@Test
void negativeZahlIstKeinePrimzahl() {
    assertThrows(
        IllegalArgumentException.class,
        () -> App.istPrimzahl(-7)
    );
}

@Test
void negativeZahlWirftFehler() {
    assertThrows(
        IllegalArgumentException.class,
        () -> App.naechstePrimzahl(-10)
    );
}

}
