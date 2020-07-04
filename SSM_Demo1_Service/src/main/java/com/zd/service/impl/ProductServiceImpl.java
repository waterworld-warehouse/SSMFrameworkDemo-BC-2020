package com.zd.service.impl;

import com.zd.Dao.IProductDao;
import com.zd.domain.Product;
import com.zd.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service.impl
 * @ClassName: ProductServiceImpl
 * @Author: 晴天
 * @Date: 2020/3/26 19:00
 * @Version: 1.0
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }


}
