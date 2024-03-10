package org.example.LengthConverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {


    @Test
    void convertMillimeters() {
        assertEquals(1.0, LengthConverter.convertMillimeters(1.0), 0.0001);
        assertEquals(5.0, LengthConverter.convertMillimeters(5.0), 0.0001);
        assertEquals(0.0, LengthConverter.convertMillimeters(0.0), 0.0001);
    }

    @Test
    void convertCentimeters() {
        assertEquals(0.1, LengthConverter.convertCentimeters(1.0), 0.0001);
        assertEquals(0.25, LengthConverter.convertCentimeters(2.5), 0.0001);
        assertEquals(0.0, LengthConverter.convertCentimeters(0.0), 0.0001);
    }

    @Test
    void convertDecimeters() {
        assertEquals(0.01, LengthConverter.convertDecimeters(1.0), 0.0001);
        assertEquals(0.02, LengthConverter.convertDecimeters(2.0), 0.0001);
        assertEquals(0.0, LengthConverter.convertDecimeters(0.0), 0.0001);
    }

    @Test
    void convertMeters() {
        assertEquals(0.001, LengthConverter.convertMeters(1.0), 0.0001);
        assertEquals(0.0025, LengthConverter.convertMeters(2.5), 0.0001);
        assertEquals(0.0, LengthConverter.convertMeters(0.0), 0.0001);
    }

    @Test
    void convertKilometers() {
        assertEquals(0.001, LengthConverter.convertKilometers(1000.0), 0.0001);
        assertEquals(0.0025, LengthConverter.convertKilometers(2500.0), 0.0001);
        assertEquals(0.0, LengthConverter.convertKilometers(0.0), 0.0001);
    }
}
