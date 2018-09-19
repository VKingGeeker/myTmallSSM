package com.tmall.service;

import com.tmall.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    /**
     * 返回产品列表
     * @return
     */
    List<Product> list();

    /**
     * 根据ID获取相应的数据
     * @param id
     * @return
     */
    Product get(Integer id);

    /**
     * 更新产品
     * @param category
     */
    void update(Product category);
    /**
     * 删除产品
     * @param id
     */
    void delete(Integer id);
    /**
     * 添加产品
     * @param category
     */
    void add(Product category);
}
