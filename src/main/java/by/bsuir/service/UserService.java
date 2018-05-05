package by.bsuir.service;

import by.bsuir.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void createClient(User user);
    void updateClient(User user);
//    User getClientByLogin(String login);
    void deleteCliens(User user);
    List<User> getAll();

    User findUserByLogin(String login);
     void saveUser(User user);

}
