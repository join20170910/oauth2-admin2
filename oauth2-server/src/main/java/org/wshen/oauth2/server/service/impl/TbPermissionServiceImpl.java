package org.wshen.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import org.wshen.oauth2.server.domain.TbPermission;
import org.wshen.oauth2.server.mapper.TbPermissionMapper;
import org.wshen.oauth2.server.service.TbPermissionService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
