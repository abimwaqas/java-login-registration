package com.ap.auth.service;

import com.ap.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
