package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void feetPlusFeet() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        3,
                        QuantityMeasurementApp.LengthUnit.FEET),

                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        2,
                                        QuantityMeasurementApp.LengthUnit.FEET))
        );
    }

    @Test
    public void feetPlusInches() {
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
                                        QuantityMeasurementApp.LengthUnit.INCHES))
        );
    }

    @Test
    public void inchesPlusFeet() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        24,
                        QuantityMeasurementApp.LengthUnit.INCHES),

                new QuantityMeasurementApp.Length(
                        12,
                        QuantityMeasurementApp.LengthUnit.INCHES)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        1,
                                        QuantityMeasurementApp.LengthUnit.FEET))
        );
    }

    @Test
    public void yardPlusFeet() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        2,
                        QuantityMeasurementApp.LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.YARDS)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        3,
                                        QuantityMeasurementApp.LengthUnit.FEET))
        );
    }

    @Test
    public void addZero() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        5,
                        QuantityMeasurementApp.LengthUnit.FEET),

                new QuantityMeasurementApp.Length(
                        5,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        0,
                                        QuantityMeasurementApp.LengthUnit.INCHES))
        );
    }

    @Test
    public void negativeValues() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        3,
                        QuantityMeasurementApp.LengthUnit.FEET),

                new QuantityMeasurementApp.Length(
                        5,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .add(
                                new QuantityMeasurementApp.Length(
                                        -2,
                                        QuantityMeasurementApp.LengthUnit.FEET))
        );
    }
}