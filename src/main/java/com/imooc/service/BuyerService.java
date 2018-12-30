package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author PGOne
 * @date 2018/12/28
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
