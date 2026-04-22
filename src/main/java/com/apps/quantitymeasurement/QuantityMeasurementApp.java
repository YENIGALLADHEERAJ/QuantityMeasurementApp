package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    /* =========================
       LENGTH CLASS
       ========================= */
    public static class Length {

        private final double value;
        private final LengthUnit unit;

        public Length(double value, LengthUnit unit) {
            if (unit == null || !Double.isFinite(value)) {
                throw new IllegalArgumentException("Invalid length");
            }

            this.value = value;
            this.unit = unit;
        }

        private double toBase() {
            return unit.convertToBaseUnit(value);
        }

        public Length convertTo(LengthUnit target) {
            if (target == null) {
                throw new IllegalArgumentException("Target unit cannot be null");
            }

            double converted =
                    target.convertFromBaseUnit(this.toBase());

            return new Length(converted, target);
        }

        public Length add(Length other) {
            return add(other, this.unit);
        }

        public Length add(Length other, LengthUnit target) {

            if (other == null || target == null) {
                throw new IllegalArgumentException("Invalid input");
            }

            double totalBase =
                    this.toBase() + other.toBase();

            double result =
                    target.convertFromBaseUnit(totalBase);

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


    /* =========================
       WEIGHT CLASS
       ========================= */
    public static class Weight {

        private final double value;
        private final WeightUnit unit;

        public Weight(double value, WeightUnit unit) {
            if (unit == null || !Double.isFinite(value)) {
                throw new IllegalArgumentException("Invalid weight");
            }

            this.value = value;
            this.unit = unit;
        }

        private double toBase() {
            return unit.convertToBaseUnit(value);
        }

        public Weight convertTo(WeightUnit target) {
            if (target == null) {
                throw new IllegalArgumentException("Target unit cannot be null");
            }

            double converted =
                    target.convertFromBaseUnit(this.toBase());

            return new Weight(converted, target);
        }

        public Weight add(Weight other) {
            return add(other, this.unit);
        }

        public Weight add(Weight other, WeightUnit target) {

            if (other == null || target == null) {
                throw new IllegalArgumentException("Invalid input");
            }

            double totalBase =
                    this.toBase() + other.toBase();

            double result =
                    target.convertFromBaseUnit(totalBase);

            return new Weight(result, target);
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (!(obj instanceof Weight other))
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