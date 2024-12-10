package pe.springmodulith.ms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.springmodulith.ms.repository.model.Order;
import pe.springmodulith.ms.repository.model.Payment;

import java.util.Optional;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {
    Optional<Payment> getPaymentByOrderId(String orderId);
}
