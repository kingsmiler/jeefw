package org.xman.jeefw.web.dao;

import org.xman.jeefw.model.User;

public interface UserDao {

    void save(User user);

    User findById(int id);

    User findBySSO(String sso);

}

