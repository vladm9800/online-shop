package by.bsuir.service;

import by.bsuir.model.Clients;
import org.springframework.stereotype.Service;


public interface ClientsService {
    void createClient(Clients clients);
    void updateClient(Clients clients);
    Clients getClientByLogin(String login);
    void deleteCliens(Clients clients);


}
