package com.wsl.ssm.service;

import com.wsl.ssm.model.Role;

import java.util.List;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/6 0006
 * 用途：
 * 描述:
 */
public interface RoleService {
    Role selectByPrimaryKey(Long id);

    List<Role> selectAll();
}
