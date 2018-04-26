package by.bsuir.dao;

import by.bsuir.model.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryDao extends CrudRepository<Delivery,Long> {
}
