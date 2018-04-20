package by.bsuir.dao;

import by.bsuir.model.DeliveryPlace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryPlaceDao extends CrudRepository<DeliveryPlace,Long> {
}
