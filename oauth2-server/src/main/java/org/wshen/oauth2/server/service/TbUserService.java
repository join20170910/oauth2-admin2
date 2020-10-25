package org.wshen.oauth2.server.service;


import org.wshen.oauth2.server.domain.TbUser;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}
