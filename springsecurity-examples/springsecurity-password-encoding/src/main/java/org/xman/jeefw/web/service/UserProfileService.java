package org.xman.jeefw.web.service;

import org.xman.jeefw.model.UserProfile;

import java.util.List;


public interface UserProfileService {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
