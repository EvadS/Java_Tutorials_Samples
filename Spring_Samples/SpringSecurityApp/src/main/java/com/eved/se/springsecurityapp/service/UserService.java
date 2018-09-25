package com.eved.se.springsecurityapp.service;

import com.eved.se.springsecurityapp.model.User;

/**
 * Service class for {@link User}
 *
 * @author Eugene
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
