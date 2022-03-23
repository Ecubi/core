package io.github.ecubi.core.events;

import io.github.ecubi.core.types.PaymentMethod;
import lombok.Value;

@Value
public class  OrderProductsReservedEvent {
    private final String orderId;
    private final PaymentMethod paymentMethod;
}
