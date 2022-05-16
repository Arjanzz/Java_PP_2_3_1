package ru.nerobkov.crudspring.service;

import ru.nerobkov.crudspring.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    void saveUser(User user);
    void deleteById(long id);
    void update(long id, User user);
}
