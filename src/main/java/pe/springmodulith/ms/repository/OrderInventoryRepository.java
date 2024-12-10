package pe.springmodulith.ms.repository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import pe.springmodulith.ms.repository.model.OrderInventory;

@Repository
public interface OrderInventoryRepository extends CrudRepository<OrderInventory, Long> {
    /*
    select sum(total_amount) from orver_inventories where orderId =
     */
    @Query(nativeQuery = true, value = "")
    long orderIdAmount(Long orderId);
}
