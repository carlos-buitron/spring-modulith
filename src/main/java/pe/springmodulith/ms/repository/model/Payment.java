package pe.springmodulith.ms.repository.model;

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

import pe.springmodulith.ms.enums.PaymentStatus;

import java.sql.Timestamp;
import java.time.Instant;

@Data
@ToString
@Entity
@Table(name = "", indexes = {@Index(name = "inv_name_idx", columnList = "name")})
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    private String orderId;
    private Long amount;
    private Timestamp paymentDate = Timestamp.from(Instant.now());
    @Enumerated(EnumType.STRING)
    private PaymentStatus status = PaymentStatus.INCOMPLETE;
}
