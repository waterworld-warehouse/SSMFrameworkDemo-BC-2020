package com.zd.service;

import com.zd.domain.Orders;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll(int page, int size) throws Exception;
    //List<Orders> findAll() throws Exception;

    Orders findById(String ordersId) throws Exception;
}
