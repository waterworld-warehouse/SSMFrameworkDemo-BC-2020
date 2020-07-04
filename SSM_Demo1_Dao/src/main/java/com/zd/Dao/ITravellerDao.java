package com.zd.Dao;

import com.zd.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.Dao
 * @ClassName: ITravellerDao
 * @Author: 晴天
 * @Date: 2020/4/8 15:57
 * @Version: 1.0
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in(select travellerId from order_traveller where orderId = #{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
