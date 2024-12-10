package pe.springmodulith.ms.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.ToString;

import pe.springmodulith.ms.enums.Status;

import java.sql.Timestamp;
import java.time.Instant;

@Data
@ToString
@Entity
@Table(name = "orders", indexes = {@Index(name = "inv_name_idx", columnList = "name")})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderId;
    @Column(unique = true, nullable = false)
    private String orderIdentifier;
    private String customerName;
    private String customerEmail;
    private Timestamp orderDate = Timestamp.from(Instant.now());
    @Enumerated(EnumType.STRING)
    private Status status = Status.OPEN;
}
