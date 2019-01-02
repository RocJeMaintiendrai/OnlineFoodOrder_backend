package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @author PGOne
 * @date 2019/01/01
 */
public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);

}
