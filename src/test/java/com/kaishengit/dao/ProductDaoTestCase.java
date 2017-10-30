package com.kaishengit.dao;

import com.kaishengit.entity.Product;
import com.kaishengit.util.BaseTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hoyt on 2017/10/30.
 */

public class ProductDaoTestCase extends BaseTestCase{

    @Autowired
    private ProductDao productDao;

    @Test
    public void saveTest() {
        Product product = new Product();
        product.setProductName("希捷硬盘");
        product.setProductInventory(100);
        productDao.save(product);
    }

    @Test
    public void findByIdTest() {
        Product product = productDao.findById(9);
        System.out.println(product);

    }

    @Test
    public void findAllTest() {
        List<Product> productList = productDao.findAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Test
    public void count() {
        Long num = productDao.count();
        System.out.println(num);
    }
}
