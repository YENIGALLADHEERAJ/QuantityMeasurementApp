package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void kilogramEqualsGram() {
        assertEquals(
                new QuantityMeasurementApp.Weight(
                        1, WeightUnit.KILOGRAM),

                new QuantityMeasurementApp.Weight(
                        1000, WeightUnit.GRAM)
        );
    }

    @Test
    public void kilogramToPound() {
        assertEquals(
                new QuantityMeasurementApp.Weight(
                        2.20462, WeightUnit.POUND),

                new QuantityMeasurementApp.Weight(
                        1, WeightUnit.KILOGRAM)
                        .convertTo(WeightUnit.POUND)
        );
    }

    @Test
    public void addKgAndGram() {
        assertEquals(
                new QuantityMeasurementApp.Weight(
                        2, WeightUnit.KILOGRAM),

                new QuantityMeasurementApp.Weight(
                        1, WeightUnit.KILOGRAM)
                        .add(
                                new QuantityMeasurementApp.Weight(
                                        1000, WeightUnit.GRAM))
        );
    }

    @Test
    public void weightNotEqualLength() {
        assertNotEquals(
                new QuantityMeasurementApp.Weight(
                        1, WeightUnit.KILOGRAM),

                new QuantityMeasurementApp.Length(
                        1, LengthUnit.FEET)
        );
    }
}