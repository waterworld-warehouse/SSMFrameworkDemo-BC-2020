package com.zd.service;

import com.zd.domain.Role;
import com.zd.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service
 * @ClassName: IUserService
 * @Author: 晴天
 * @Date: 2020/4/9 16:36
 * @Version: 1.0
 */
public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo) throws  Exception;

    UserInfo findById(String id) throws Exception;

    List<Role> findOtherRoles(String userId) throws Exception;

    void addRoleToUser(String userId, String[] roleIds) throws Exception;
}
