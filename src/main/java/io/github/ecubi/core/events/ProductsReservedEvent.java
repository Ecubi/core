package io.github.ecubi.core.events;

import io.github.ecubi.core.types.PaymentMethod;
import lombok.Value;

@Value
public class ProductsReservedEvent {
    private String orderId;
    private PaymentMethod paymentMethod;
}
