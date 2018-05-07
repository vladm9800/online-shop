package by.bsuir.dao;

import by.bsuir.model.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderDao extends CrudRepository<Orders,Long> {
//    @Query("select u from Orders u where u.id = 'id'")
//    Orders findOrdersById(Long id);
}
