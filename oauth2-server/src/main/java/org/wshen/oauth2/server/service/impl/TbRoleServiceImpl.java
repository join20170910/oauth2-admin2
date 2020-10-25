package org.wshen.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import org.wshen.oauth2.server.mapper.TbRoleMapper;
import org.wshen.oauth2.server.service.TbRoleService;

import javax.annotation.Resource;

@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}
