package com.zd.service;

import com.zd.domain.Permission;
import com.zd.domain.Role;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service
 * @ClassName: IRoleService
 * @Author: 晴天
 * @Date: 2020/4/11 9:41
 * @Version: 1.0
 */
public interface IRoleService{

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws Exception;

    List<Permission> findOtherPermission(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
