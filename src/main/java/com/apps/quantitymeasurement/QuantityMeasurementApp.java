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

        public Length convertTo(LengthUnit target) {
            double converted = toBaseInches() / target.getFactor();
            return new Length(converted, target);
        }

        public Length add(Length other) {
            return add(other, this.unit);
        }

        public Length add(Length other, LengthUnit targetUnit) {

            if (other == null || targetUnit == null)
                throw new IllegalArgumentException();

            double total =
                    this.toBaseInches() +
                            other.toBaseInches();

            double result =
                    total / targetUnit.getFactor();

            return new Length(result, targetUnit);
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (!(obj instanceof Length other))
                return false;

            return Math.abs(
                    this.toBaseInches() -
                            other.toBaseInches()
            ) < 0.0001;
        }
    }
}