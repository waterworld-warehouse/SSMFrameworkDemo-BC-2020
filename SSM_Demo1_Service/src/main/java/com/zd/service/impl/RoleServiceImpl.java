package com.zd.service.impl;

import com.zd.Dao.IRoleDao;
import com.zd.domain.Permission;
import com.zd.domain.Role;
import com.zd.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service
 * @ClassName: RoleServiceImpl
 * @Author: 晴天
 * @Date: 2020/4/11 9:41
 * @Version: 1.0
 */

@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Role> findAll() throws Exception {
        return roleDao.findAll();
    }

    @Override
    public void save(Role role) throws Exception{
        roleDao.save(role);
    }

    @Override
    public Role findById(String roleId) throws Exception{
        return roleDao.findById(roleId);
    }

    @Override
    public List<Permission> findOtherPermission(String roleId) throws Exception {
        return roleDao.findOtherPermission(roleId);
    }

    @Override
    public void addPermissionToRole(String roleId, String[] permissionIds) throws Exception {
        for(String permissionId:permissionIds){
            roleDao.addPermissionToRole(roleId,permissionId);
        }
    }
}
