package io.github.ecubi.core.events;

import lombok.Value;

@Value
public class OrderProductsReservationFailedEvent {
    private final String orderId;
    private final String error;
}
