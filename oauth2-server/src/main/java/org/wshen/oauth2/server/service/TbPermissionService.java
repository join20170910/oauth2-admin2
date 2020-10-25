package org.wshen.oauth2.server.service;

import org.wshen.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService {
    default List<TbPermission> selectByUserId(Long userId) {
        return null;
    }
}
