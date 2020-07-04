package com.zd.service.impl;

import com.zd.Dao.IPermissionDao;
import com.zd.domain.Permission;
import com.zd.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service.impl
 * @ClassName: PermissionServiceImpl
 * @Author: 晴天
 * @Date: 2020/4/11 10:15
 * @Version: 1.0
 */

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public List<Permission> findAll() throws Exception {
        return permissionDao.findAll();
    }

    @Override
    public void save(Permission permission) throws Exception {
        permissionDao.save(permission);
    }
}
