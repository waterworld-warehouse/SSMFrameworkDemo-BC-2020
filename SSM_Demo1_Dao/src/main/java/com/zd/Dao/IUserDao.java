package com.zd.Dao;

import com.zd.domain.Role;
import com.zd.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.Dao
 * @ClassName: IUserDao
 * @Author: 晴天
 * @Date: 2020/4/9 16:45
 * @Version: 1.0
 */
public interface IUserDao {

    @Select("select * from users where username = #{username}")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "email",column = "email"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "phoneNum",column = "phoneNum"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.zd.Dao.IRoleDao.findRoleByUserId"))
    })
    public UserInfo findByUsername(String username) throws Exception;

    @Select("select * from users")
    List<UserInfo> findAll() throws Exception;

    @Insert("insert into users(email,username,password,phoneNum,status) values(#{email},#{username},#{password},#{phoneNum},#{status})")
    void save(UserInfo userInfo) throws Exception;

    @Select("select * from users where id = #{id}")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "email",column = "email"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "phoneNum",column = "phoneNum"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.zd.Dao.IRoleDao.findRoleByUserId"))
    })
    UserInfo findById(String id) throws Exception;

    @Select("select * from role where id not in(select roleId from users_role where userId = #{userId})")
    List<Role> findOtherRoles(String userId) throws Exception;

    @Insert("insert into users_role(userId,roleId) values(#{userId},#{roleId})")
    void addRoleToUser(@Param("userId") String userId, @Param("roleId") String roleId);
}
