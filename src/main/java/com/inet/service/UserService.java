package com.inet.service;

import com.inet.po.User;

public interface UserService {
    User checkUser(String username,String password);

}
