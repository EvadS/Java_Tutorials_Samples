package com.eved.se.springsecurityapp.service;

/**
 * Service for Security.
 *
 * @author Eugene
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
