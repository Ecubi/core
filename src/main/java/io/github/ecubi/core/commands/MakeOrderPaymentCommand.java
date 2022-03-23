package io.github.ecubi.core.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class MakeOrderPaymentCommand {

    @TargetAggregateIdentifier
    private final String orderId;

    private final String userId;

    private final String cardId;
}
