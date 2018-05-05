package by.bsuir.dao;

import by.bsuir.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role,Long> {
    Role findByRole(String role);
}
