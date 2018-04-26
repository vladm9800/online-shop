package by.bsuir.service.serviceImpl;

import by.bsuir.dao.ClientsDao;

import by.bsuir.model.Clients;
import by.bsuir.service.ClientsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("ClientsService")
public class ClientsServiceImpl implements ClientsService{


    private ClientsDao clientsDao;

    @Autowired
    public void setClientsDao(ClientsDao clientsDao) {
        this.clientsDao = clientsDao;
    }

    @Override
    @Transactional
    public void createClient(Clients clients) {
        clients.setPassword( clients.getPassword());
        clientsDao.save(clients);
    }

    @Override
    @Transactional
    public void updateClient(Clients clients) {

     Clients clients1=   clientsDao.findById(clients.getId()).get();
     clients1.setNameCl(clients.getNameCl());
     clients1.setSurnameCl(clients.getSurnameCl());
     clients1.setPatronymicCl(clients.getPatronymicCl());
     clients1.setEmailCl(clients.getEmailCl());
     clients1.setAddressCl(clients.getAddressCl());
     clients1.setDateOfBrth(clients.getDateOfBrth());


    }
//    @Override
//    @Transactional
//    public Clients getClientByLogin(String login) {
//
//        return clientsDao.findClientsByLogin(login);
//
//    }


    @Override
    @Transactional
    public List<Clients> getAll() {

        return (List<Clients>)clientsDao.findAll();
    }

    @Override
    @Transactional
    public void deleteCliens(Clients clients) {

        clientsDao.delete(clients);
    }
}
