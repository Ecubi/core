package io.github.ecubi.core.types;

import java.util.Arrays;
import java.util.Optional;

public enum PaymentMethod {
    CARD("card"),
    CASH("cash"),
    AGREEMENT("agreement");

    public final String label;

    private PaymentMethod(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static Optional<PaymentMethod> get(String label) {
        return Arrays.stream(PaymentMethod.values())
                .filter(type -> type.label.equals(label))
                .findFirst();
    }
}
