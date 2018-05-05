package by.bsuir.dao;

import by.bsuir.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsDao extends CrudRepository<User,Long>  {
    User findByLogin(String login);
}
