package pl.coderslab.charity.service;

import pl.coderslab.charity.entity.User;

public interface UserService {
    User findByUserName(String userName);
    void saveUser(User user);
}
