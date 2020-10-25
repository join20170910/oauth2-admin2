package org.wshen.oauth2.content.resource.service.impl;

import org.springframework.stereotype.Service;
import org.wshen.oauth2.content.resource.mapper.TbContentCategoryMapper;
import org.wshen.oauth2.content.resource.service.TbContentCategoryService;

import javax.annotation.Resource;

@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
