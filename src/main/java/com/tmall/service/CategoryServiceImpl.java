package com.tmall.service;

import com.tmall.mapper.CategoryMapper;
import com.tmall.pojo.Category;
import com.tmall.pojo.CategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;
    public List<Category> list() {
        CategoryExample categoryExample = new CategoryExample();
        List<Category> categories = categoryMapper.selectByExample(categoryExample);
        return categories;
    }

    public Category get(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    public void update(Category category) {
        categoryMapper.updateByPrimaryKey(category);
    }
}
