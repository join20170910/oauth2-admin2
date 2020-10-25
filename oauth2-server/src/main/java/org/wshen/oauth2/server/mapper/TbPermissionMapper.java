package org.wshen.oauth2.server.mapper;

import org.apache.ibatis.annotations.Param;
import org.wshen.oauth2.server.domain.TbPermission;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}