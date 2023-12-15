package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    List<User> readAllUsers();
    User getUserById(int id);
    void create(User user);
    User update(int id);
    void delete(int id);
}