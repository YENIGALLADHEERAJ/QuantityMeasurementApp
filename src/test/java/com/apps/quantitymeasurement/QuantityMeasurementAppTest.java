package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void feetToInches() {
        assertEquals(
                12.0,
                QuantityMeasurementApp.convert(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCHES
                ),
                0.0001
        );
    }

    @Test
    public void yardsToFeet() {
        assertEquals(
                9.0,
                QuantityMeasurementApp.convert(
                        3,
                        QuantityMeasurementApp.LengthUnit.YARDS,
                        QuantityMeasurementApp.LengthUnit.FEET
                ),
                0.0001
        );
    }

    @Test
    public void inchesToYards() {
        assertEquals(
                1.0,
                QuantityMeasurementApp.convert(
                        36,
                        QuantityMeasurementApp.LengthUnit.INCHES,
                        QuantityMeasurementApp.LengthUnit.YARDS
                ),
                0.0001
        );
    }

    @Test
    public void cmToInches() {
        assertEquals(
                1.0,
                QuantityMeasurementApp.convert(
                        2.54,
                        QuantityMeasurementApp.LengthUnit.CENTIMETERS,
                        QuantityMeasurementApp.LengthUnit.INCHES
                ),
                0.01
        );
    }

    @Test
    public void sameUnitConversion() {
        assertEquals(
                5.0,
                QuantityMeasurementApp.convert(
                        5,
                        QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.FEET
                ),
                0.0001
        );
    }

    @Test
    public void invalidValueThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityMeasurementApp.convert(
                        Double.NaN,
                        QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCHES
                )
        );
    }
}