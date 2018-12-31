/*
 * Copyright (c) 2018, Cardinal Operations and/or its affiliates. All rights reserved.
 * CARDINAL OPERATIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.imooc.utils;

/**
 * Created by peng Guo
 * 2017-07-09 16:56
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    /**
     * 比较2个金额是否相等
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        }else {
            return false;
        }
    }
}
