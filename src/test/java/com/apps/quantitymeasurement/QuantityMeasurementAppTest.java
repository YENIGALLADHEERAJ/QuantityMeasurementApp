package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {
        assertEquals(
                new QuantityMeasurementApp.Feet(1.0),
                new QuantityMeasurementApp.Feet(1.0)
        );
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        assertNotEquals(
                new QuantityMeasurementApp.Feet(1.0),
                new QuantityMeasurementApp.Feet(2.0)
        );
    }

    @Test
    public void testInchesEquality_SameValue() {
        assertEquals(
                new QuantityMeasurementApp.Inches(1.0),
                new QuantityMeasurementApp.Inches(1.0)
        );
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        assertNotEquals(
                new QuantityMeasurementApp.Inches(1.0),
                new QuantityMeasurementApp.Inches(2.0)
        );
    }

    @Test
    public void testFeetAndInchesAreDifferentTypes() {
        assertNotEquals(
                new QuantityMeasurementApp.Feet(1.0),
                new QuantityMeasurementApp.Inches(1.0)
        );
    }
}