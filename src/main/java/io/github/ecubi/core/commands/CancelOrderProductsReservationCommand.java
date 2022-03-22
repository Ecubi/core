package io.github.ecubi.core.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class CancelOrderProductsReservationCommand {
    @TargetAggregateIdentifier
    private String orderId;
}
