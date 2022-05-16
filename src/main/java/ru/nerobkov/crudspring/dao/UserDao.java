package ru.nerobkov.crudspring.dao;

import ru.nerobkov.crudspring.models.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(long id);
    void saveUser(User user);
    void deleteById(long id);
    void update(long id, User user);
}
