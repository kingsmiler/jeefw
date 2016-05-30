package org.xman.jeefw.web.service;


import org.xman.jeefw.model.User;

public interface UserService {

    User findById(int id);

    User findBySso(String sso);

}