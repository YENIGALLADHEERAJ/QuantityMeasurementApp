package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET),

                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET)
        );
    }

    @Test
    public void testInchesEquality() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.INCHES),

                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.INCHES)
        );
    }

    @Test
    public void testFeetInchesComparison() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET),

                new QuantityMeasurementApp.Length(
                        12,
                        QuantityMeasurementApp.LengthUnit.INCHES)
        );
    }

    @Test
    public void testFeetInequality() {
        assertNotEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET),

                new QuantityMeasurementApp.Length(
                        2,
                        QuantityMeasurementApp.LengthUnit.FEET)
        );
    }

    @Test
    public void testInchesInequality() {
        assertNotEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.INCHES),

                new QuantityMeasurementApp.Length(
                        2,
                        QuantityMeasurementApp.LengthUnit.INCHES)
        );
    }

    @Test
    public void testSameReference() {
        QuantityMeasurementApp.Length length =
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET);

        assertEquals(length, length);
    }
}