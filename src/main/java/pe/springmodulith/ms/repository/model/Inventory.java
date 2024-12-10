package pe.springmodulith.ms.repository.model;

import jakarta.persistence.Column;
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
@Table(name = "inventories", indexes = {@Index(name = "inv_name_idx", columnList = "name")})
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long InventoryId;
    @Column(unique = true, nullable = false)
    private String name;
    private String description;
    private BigDecimal price;
}
