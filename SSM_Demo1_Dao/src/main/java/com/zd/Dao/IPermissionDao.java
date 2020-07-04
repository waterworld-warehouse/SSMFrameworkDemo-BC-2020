package com.zd.Dao;

import com.zd.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.Dao
 * @ClassName: IPermissionDao
 * @Author: 晴天
 * @Date: 2020/4/10 19:23
 * @Version: 1.0
 */
public interface IPermissionDao {

    @Select("select * from permission where id in(select permissionId from role_permission where roleId = #{id})")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;

    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    @Insert("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission) throws Exception;
}
