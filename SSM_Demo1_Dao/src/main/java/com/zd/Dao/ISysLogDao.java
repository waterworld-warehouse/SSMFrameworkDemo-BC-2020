package com.zd.Dao;

import com.zd.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.Dao
 * @ClassName: ISysLogDao
 * @Author: 晴天
 * @Date: 2020/4/14 15:26
 * @Version: 1.0
 */
public interface ISysLogDao {
    /*@Insert("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")*/
    @Insert("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    public void save(SysLog sysLog) throws Exception;


    @Select("select * from syslog")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "visitTime",property = "visitTime"),
            @Result(column = "username",property = "username"),
            @Result(column = "ip",property = "ip"),
            @Result(column = "url",property = "url"),
            @Result(column = "executionTime",property = "executionTime"),
            @Result(column = "method",property = "method")
    })
    List<SysLog> findAll();
}
