package com.wsl.ssm.service.impl;

import com.wsl.ssm.dao.RoleMapper;
import com.wsl.ssm.model.Role;
import com.wsl.ssm.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/6 0006
 * 用途：
 * 描述:
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;

    @Override
    public Role selectByPrimaryKey(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }
}
