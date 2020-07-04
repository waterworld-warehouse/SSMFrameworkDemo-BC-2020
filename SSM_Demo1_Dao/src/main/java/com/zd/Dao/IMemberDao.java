package com.zd.Dao;

import com.zd.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.Dao
 * @ClassName: IMemberDao
 * @Author: 晴天
 * @Date: 2020/4/8 15:46
 * @Version: 1.0
 */
public interface IMemberDao {

    /*@Select("select * form member where id={#id}")
    public Member findById(String id) throws Exception;*/

    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
