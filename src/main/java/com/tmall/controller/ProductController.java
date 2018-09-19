package com.tmall.controller;

import com.tmall.pojo.Product;
import com.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/listProduct")
    public String list(Model model) {
        List<Product> categories = productService.list();
        model.addAttribute("categories", categories);
        return "admin/listProduct";
    }
    @RequestMapping("/editProduct")
    public String edit(Model model,Product product) {
        model.addAttribute("product", product);
        return "admin/editProduct";
    }

    @RequestMapping("/addProduct")
    public String add(Product product) {
        productService.add(product);
        return "redirect:listProduct";
    }

    @RequestMapping("/deleteProduct")
    public String delete(Integer id) {
        productService.delete(id);
        return "redirect:listProduct";
    }

    @RequestMapping("/updateProduct")
    public String update(Product product) {
        productService.update(product);
        return "redirect:listProduct";
    }
}
