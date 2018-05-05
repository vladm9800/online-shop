package by.bsuir.service.serviceImpl;

import by.bsuir.dao.ClientsDao;

import by.bsuir.dao.RoleDao;
import by.bsuir.model.User;
import by.bsuir.model.Role;
import by.bsuir.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


@Service("ClientsService")
public class UserServiceImpl implements UserService {

    private RoleDao roleDao;
    private ClientsDao clientsDao;

    private BCryptPasswordEncoder bCryptPasswordEncoder;



    @Override
    public User findUserByLogin(String login) {
        return clientsDao.findByLogin(login);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Role userRole = roleDao.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        clientsDao.save(user);
    }

    @Override
    @Transactional
    public void createClient(User user) {
        user.setPassword( user.getPassword());
        clientsDao.save(user);
    }

    @Override
    @Transactional
    public void updateClient(User user) {

     User user1 =   clientsDao.findById(user.getUserId()).get();
     user1.setName(user.getName());
     user1.setSurname(user.getSurname());

     user1.setEmail(user.getEmail());
     user1.setAddress(user.getAddress());
     user1.setDateOfBrth(user.getDateOfBrth());


    }
//    @Override
//    @Transactional
//    public User getClientByLogin(String login) {
//
//        return clientsDao.findClientsByLogin(login);
//
//    }


    @Override
    @Transactional
    public List<User> getAll() {

        return (List<User>)clientsDao.findAll();
    }

    @Override
    @Transactional
    public void deleteCliens(User user) {

        clientsDao.delete(user);
    }
    @Autowired
    public void setClientsDao(ClientsDao clientsDao) {
        this.clientsDao = clientsDao;
    }
    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }
    @Autowired
    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
}
