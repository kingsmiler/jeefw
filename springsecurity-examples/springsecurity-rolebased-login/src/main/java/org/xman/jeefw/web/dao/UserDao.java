package org.xman.jeefw.web.dao;


import org.xman.jeefw.model.User;

public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);

}

