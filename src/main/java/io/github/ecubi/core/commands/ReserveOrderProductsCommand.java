package io.github.ecubi.core.commands;

import io.github.ecubi.core.entities.OrderItem;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.List;

@Value
public class ReserveOrderProductsCommand {
    @TargetAggregateIdentifier
    private final String orderId;

    private final String branchId;

    private final List<OrderItem> items;

}
