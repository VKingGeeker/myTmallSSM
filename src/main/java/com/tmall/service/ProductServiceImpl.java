package com.tmall.service;

import com.tmall.mapper.ProductMapper;
import com.tmall.pojo.Product;
import com.tmall.pojo.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    public List<Product> list() {
        ProductExample productExample = new ProductExample();
        List<Product> products = productMapper.selectByExample(productExample);
        return products;
    }

    public Product get(Integer id) {
        Product product = productMapper.selectByPrimaryKey(id);
        return product;
    }

    public void update(Product product) {
        productMapper.updateByPrimaryKey(product);
    }

    public void delete(Integer id) {
        productMapper.deleteByPrimaryKey(id);
    }

    public void add(Product product) {
        productMapper.insert(product);
    }
}
