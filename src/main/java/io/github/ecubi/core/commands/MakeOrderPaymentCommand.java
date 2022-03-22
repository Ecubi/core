package io.github.ecubi.core.commands;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class MakeOrderPaymentCommand {

    @TargetAggregateIdentifier
    private String orderId;

    private String userId;

    private String cardId;
}
