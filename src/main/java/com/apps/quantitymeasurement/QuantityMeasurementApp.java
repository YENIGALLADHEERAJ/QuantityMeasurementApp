package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double factor;

        LengthUnit(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

    public static class Length {

        private final double value;
        private final LengthUnit unit;

        public Length(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }

        private double toBaseInches() {
            return value * unit.getFactor();
        }

        public Length convertTo(LengthUnit targetUnit) {

            double inches = toBaseInches();
            double converted = inches / targetUnit.getFactor();

            return new Length(converted, targetUnit);
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Length other = (Length) obj;

            return Math.abs(
                    this.toBaseInches() -
                            other.toBaseInches()
            ) < 0.0001;
        }
    }

    public static double convert(
            double value,
            LengthUnit source,
            LengthUnit target) {

        if (!Double.isFinite(value))
            throw new IllegalArgumentException("Invalid value");

        Length length = new Length(value, source);

        return length.convertTo(target).value;
    }
}