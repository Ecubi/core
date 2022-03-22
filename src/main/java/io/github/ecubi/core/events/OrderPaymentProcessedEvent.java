package io.github.ecubi.core.events;

import lombok.Value;

@Value
public class OrderPaymentProcessedEvent {
    private String orderId;
    private String userId;
    private String cardId;
    private String vendorPaymentId;
}
