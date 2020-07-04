package com.zd.service;

import com.zd.domain.Permission;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service
 * @ClassName: IPermissionService
 * @Author: 晴天
 * @Date: 2020/4/11 10:15
 * @Version: 1.0
 */
public interface IPermissionService {
    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
