package io.github.ecubi.core.types;

import java.util.Arrays;
import java.util.Optional;

public enum ShippingMethod {
    BUY_IN_SHOP("buy_in_shop"),
    DELIVERY("delivery"),
    SHOP_PICKUP("shop_pickup");

    public final String label;

    private ShippingMethod(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static Optional<ShippingMethod> get(String label) {
        return Arrays.stream(ShippingMethod.values())
                .filter(type -> type.label.equals(label))
                .findFirst();
    }
}
