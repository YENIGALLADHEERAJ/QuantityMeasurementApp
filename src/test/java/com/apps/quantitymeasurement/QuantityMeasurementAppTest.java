package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void addTargetFeet() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        2,
                        QuantityMeasurementApp.LengthUnit.FEET),

                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        12,
                                        QuantityMeasurementApp.LengthUnit.INCHES),

                                QuantityMeasurementApp.LengthUnit.FEET)
        );
    }

    @Test
    public void addTargetInches() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        24,
                        QuantityMeasurementApp.LengthUnit.INCHES),

                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        12,
                                        QuantityMeasurementApp.LengthUnit.INCHES),

                                QuantityMeasurementApp.LengthUnit.INCHES)
        );
    }

    @Test
    public void addTargetYards() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        0.666666,
                        QuantityMeasurementApp.LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        12,
                                        QuantityMeasurementApp.LengthUnit.INCHES),

                                QuantityMeasurementApp.LengthUnit.YARDS)
        );
    }

    @Test
    public void addCentimeters() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        5.08,
                        QuantityMeasurementApp.LengthUnit.CENTIMETERS),

                new QuantityMeasurementApp.Length(
                        2.54,
                        QuantityMeasurementApp.LengthUnit.CENTIMETERS)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        1,
                                        QuantityMeasurementApp.LengthUnit.INCHES),

                                QuantityMeasurementApp.LengthUnit.CENTIMETERS)
        );
    }

    @Test
    public void addWithZero() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        1.666666,
                        QuantityMeasurementApp.LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        5,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        0,
                                        QuantityMeasurementApp.LengthUnit.INCHES),

                                QuantityMeasurementApp.LengthUnit.YARDS)
        );
    }

    @Test
    public void nullTargetThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        1,
                                        QuantityMeasurementApp.LengthUnit.FEET),
                                null)
        );
    }
}