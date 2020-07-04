package com.zd.Dao;

import com.zd.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.Dao
 * @ClassName: IProductDao
 * @Author: 晴天
 * @Date: 2020/4/7 14:59
 * @Version: 1.0
 */
public interface IProductDao {
    @Select("select * from product")
    List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice," +
            "productDesc,productStatus)values(#{productNum},#{productName},#{cityName}," +
            "#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);

    //根据id查询产品
    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;
}
