package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author PGOne
 * @date 2019/01/01
 */
public interface PushMessage {

    //状态变更消息
    void orderStatus(OrderDTO orderDTO);


}
