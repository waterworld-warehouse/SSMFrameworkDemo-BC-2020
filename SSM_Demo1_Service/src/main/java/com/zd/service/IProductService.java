package com.zd.service;

import com.zd.domain.Product;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service
 * @ClassName: IProductService
 * @Author: 晴天
 * @Date: 2020/3/26 18:52
 * @Version: 1.0
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
