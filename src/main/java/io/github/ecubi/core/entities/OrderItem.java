package io.github.ecubi.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OrderItem {
    private String variantId;
    private Double quantity;
    private List<ModifierGroup> modifiersGroups;
}
