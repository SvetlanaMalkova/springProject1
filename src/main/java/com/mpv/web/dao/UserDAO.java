package com.mpv.web.dao;

import com.mpv.web.model.User;
import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User findById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
