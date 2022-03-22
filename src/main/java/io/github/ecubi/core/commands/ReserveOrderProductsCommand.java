package io.github.ecubi.core.commands;

import io.github.ecubi.core.entities.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.List;

@Value
public class ReserveOrderProductsCommand {
    @TargetAggregateIdentifier
    private String orderId;

    private String branchId;

    private List<OrderItem> items;

}
