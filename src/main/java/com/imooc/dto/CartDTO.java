package com.imooc.dto;

import lombok.Data;

/**
 * @author PGOne
 * @date 2018/12/27
 */
@Data
public class CartDTO {

    private String prodcutId;


    private Integer ProductQuantity;

    public CartDTO(String prodcutId, Integer productQuantity) {
        this.prodcutId = prodcutId;
        ProductQuantity = productQuantity;
    }

    public String getProdcutId() {
        return prodcutId;
    }

    public void setProdcutId(String prodcutId) {
        this.prodcutId = prodcutId;
    }

    public Integer getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        ProductQuantity = productQuantity;
    }
}
