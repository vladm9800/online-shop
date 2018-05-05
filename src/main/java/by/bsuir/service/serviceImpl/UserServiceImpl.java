package by.bsuir.service.serviceImpl;

import by.bsuir.dao.UserDao;

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
    private UserDao userDao;

    private BCryptPasswordEncoder bCryptPasswordEncoder;



    @Override
    public User findUserByLogin(String login) {
        return userDao.findByLogin(login);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Role userRole = roleDao.findByRole("USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        user.setActive(1);
        userDao.save(user);
    }


    @Override
    @Transactional
    public List<User> getAll() {

        return (List<User>) userDao.findAll();
    }

    @Override
    @Transactional
    public void deleteCliens(User user) {

        userDao.delete(user);
    }
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
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
