package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeServiceFakeTest {

    @Test
    void pruefePrimzahl() {

        PrimeService service =
                new PrimeService();

        assertTrue(
                service.pruefe(7)
        );

    }
}