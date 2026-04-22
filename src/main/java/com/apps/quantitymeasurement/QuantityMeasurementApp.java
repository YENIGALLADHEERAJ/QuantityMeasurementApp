package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static class Length {

        private final double value;
        private final LengthUnit unit;

        public Length(double value, LengthUnit unit) {

            if (unit == null || !Double.isFinite(value))
                throw new IllegalArgumentException();

            this.value = value;
            this.unit = unit;
        }

        private double toBase() {
            return unit.convertToBaseUnit(value);
        }

        public Length convertTo(LengthUnit target) {

            double converted =
                    target.convertFromBaseUnit(
                            this.toBase()
                    );

            return new Length(converted, target);
        }

        public Length add(Length other) {
            return add(other, this.unit);
        }

        public Length add(Length other, LengthUnit target) {

            if (other == null || target == null)
                throw new IllegalArgumentException();

            double total =
                    this.toBase() +
                            other.toBase();

            double result =
                    target.convertFromBaseUnit(total);

            return new Length(result, target);
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (!(obj instanceof Length other))
                return false;

            return Math.abs(
                    this.toBase() - other.toBase()
            ) < 0.0001;
        }

        @Override
        public String toString() {
            return value + " " + unit;
        }
    }
}