package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> readAllUsers();

    User getUserById(int id);

    void create(User user);

    void update(User user);

    void delete(int id);
}