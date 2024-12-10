package pe.springmodulith.ms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.springmodulith.ms.repository.model.Inventory;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvetoryRepository extends CrudRepository<Inventory, Long> {
    Optional<Inventory> getInvetoryByName(String name);
    List<Inventory> getInvetoryByNameIn(List<String> names);
}
