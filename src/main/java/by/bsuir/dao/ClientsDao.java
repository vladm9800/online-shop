package by.bsuir.dao;

import by.bsuir.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsDao extends CrudRepository<Clients,Long>  {
    @Query("select u from Clients u where u.login = :#{login}")
    Clients findClientsByLogin(String login);
}
