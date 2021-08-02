package com.example.shoptest.service;

import com.github.pagehelper.PageInfo;

import com.example.shoptest.entity.vo.CartVO;

import com.example.shoptest.entity.vo.OrderVO;
import java.util.List;

public class OrderService {


    OrderVO detail(String orderNo);

    PageInfo listForCustomer(Integer pageNum, Integer pageSize);

    void cancel(String orderNo);

    String qrcode(String orderNo);

    void pay(String orderNo);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    void deliver(String orderNo);

    void finish(String orderNo);
}
