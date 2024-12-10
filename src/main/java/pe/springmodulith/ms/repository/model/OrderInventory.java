package pe.springmodulith.ms.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
@Entity
@Table(name = "order_inventories", indexes = {
        @Index(name = "ord_idx", columnList = "order_id"),
        @Index(name = "inv_idx", columnList = "inventory_id")
})
public class OrderInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderInventoryId;
    private Long orderId;
    private Long inventoryId;
    private int quantity;
    private BigDecimal totalQuantityPrice;
}
