package org.wshen.oauth2.content.resource.service.impl;

import org.springframework.stereotype.Service;
import org.wshen.oauth2.content.resource.domain.TbContent;
import org.wshen.oauth2.content.resource.mapper.TbContentMapper;
import org.wshen.oauth2.content.resource.service.TbContentService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbContentServiceImpl implements TbContentService {

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public TbContent getById(Long id) {
        return tbContentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }

    @Override
    public int insert(TbContent tbContent) {
        return tbContentMapper.insert(tbContent);
    }

    @Override
    public int update(TbContent tbContent) {
        return tbContentMapper.updateByPrimaryKey(tbContent);
    }

    @Override
    public int delete(Long id) {
        return tbContentMapper.deleteByPrimaryKey(id);
    }
}
