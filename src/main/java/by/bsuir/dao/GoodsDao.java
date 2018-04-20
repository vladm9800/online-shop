package by.bsuir.dao;

import by.bsuir.model.Goods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDao extends CrudRepository<Goods,Long>{
}
