package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void yardEqualsFeet() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        3,
                        QuantityMeasurementApp.LengthUnit.FEET)
        );
    }

    @Test
    public void yardEqualsInches() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        36,
                        QuantityMeasurementApp.LengthUnit.INCHES)
        );
    }

    @Test
    public void centimeterEqualsInches() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.CENTIMETERS),

                new QuantityMeasurementApp.Length(
                        0.393701,
                        QuantityMeasurementApp.LengthUnit.INCHES)
        );
    }

    @Test
    public void sameYardsEqual() {
        assertEquals(
                new QuantityMeasurementApp.Length(
                        2,
                        QuantityMeasurementApp.LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        2,
                        QuantityMeasurementApp.LengthUnit.YARDS)
        );
    }

    @Test
    public void differentValuesNotEqual() {
        assertNotEquals(
                new QuantityMeasurementApp.Length(
                        1,
                        QuantityMeasurementApp.LengthUnit.YARDS),

                new QuantityMeasurementApp.Length(
                        2,
                        QuantityMeasurementApp.LengthUnit.FEET)
        );
    }
}