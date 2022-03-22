package io.github.ecubi.core.events;

import lombok.Value;

@Value
public class ProductsReservationFailedEvent {
    private final String orderId;
    private final String error;
}
