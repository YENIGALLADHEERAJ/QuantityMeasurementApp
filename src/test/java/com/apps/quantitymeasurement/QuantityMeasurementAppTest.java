package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void feetToInches() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        12,
                        LengthUnit.INCHES),

                new QuantityMeasurementApp.Length(
                        1,
                        LengthUnit.FEET)
                        .convertTo(LengthUnit.INCHES)
        );
    }

    @Test
    public void equalityCheck() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        36,
                        LengthUnit.INCHES)
        );
    }

    @Test
    public void addWithTargetFeet() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        2,
                        LengthUnit.FEET),

                new QuantityMeasurementApp.Length(
                        1,
                        LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        12,
                                        LengthUnit.INCHES),

                                LengthUnit.FEET)
        );
    }

    @Test
    public void addWithTargetYards() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        0.666666,
                        LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        1,
                        LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        12,
                                        LengthUnit.INCHES),

                                LengthUnit.YARDS)
        );
    }

    @Test
    public void nullUnitThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityMeasurementApp.Length(
                        1,
                        null)
        );
    }

    @Test
    public void invalidValueThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityMeasurementApp.Length(
                        Double.NaN,
                        LengthUnit.FEET)
        );
    }
}