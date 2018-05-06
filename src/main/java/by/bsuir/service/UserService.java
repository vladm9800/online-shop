package by.bsuir.service;

import by.bsuir.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void deleteCliens(User user);
    List<User> getAll();
    User findUserByLogin(String login);
    void saveUser(User user);
    void changeStaus(User user );

}
