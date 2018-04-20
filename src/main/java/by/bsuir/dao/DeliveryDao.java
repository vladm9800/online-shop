package by.bsuir.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryDao extends CrudRepository<DeliveryDao,Long> {
}
