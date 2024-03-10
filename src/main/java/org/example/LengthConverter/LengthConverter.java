package org.example.LengthConverter;

public class LengthConverter {

    public static double convertMillimeters(double v) {
        return v;
    }

    public static double convertCentimeters(double v) {
        return v / 10;
    }

    public static double convertDecimeters(double v) {
        return v / 100;
    }

    public static double convertMeters(double v) {
        return v / 1000;
    }

    public static double convertKilometers(double v) {
        return v / 1_000_000;
    }
}
