package com.imooc.service;


import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @author PGOne
 * @date 2018/12/24
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);



}
