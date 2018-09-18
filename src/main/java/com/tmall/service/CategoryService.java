package com.tmall.service;

import com.tmall.pojo.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    /**
     * 返回分类列表
     * @return
     */
    List<Category> list();

    /**
     * 根据ID获取相应的数据
     * @param id
     * @return
     */
    Category get(Integer id);

    /**
     * 更新分类
     * @param category
     */
    void update(Category category);
}
