package io.github.ecubi.core.events;

import lombok.Value;

@Value
public class OrderProductsReservationCancelledEvent {
    private final String orderId;
    private final String reason;
}
