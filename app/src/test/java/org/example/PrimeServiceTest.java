package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class PrimeServiceTest {

    @Test
    void mockTest() {

        PrimeService service =
                mock(PrimeService.class);

        when(service.pruefe(7))
                .thenReturn(true);

        assertTrue(
                service.pruefe(7)
        );
    }
}