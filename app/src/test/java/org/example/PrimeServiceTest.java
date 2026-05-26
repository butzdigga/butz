package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PrimeServiceTest {

    @Test
    void mockTest() {

        PrimeService service =
                spy(new PrimeService());

        doReturn(true)
                .when(service)
                .pruefe(7);

        assertTrue(
                service.pruefe(7)
        );
    }
}