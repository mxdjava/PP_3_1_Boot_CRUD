package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public List<User> readAllUsers() {
        return userDao.readAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    public User update(int id) {
        return userDao.update(id);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}