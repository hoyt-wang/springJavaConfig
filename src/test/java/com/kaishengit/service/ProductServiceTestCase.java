package com.kaishengit.service;

import com.kaishengit.entity.Product;
import com.kaishengit.util.BaseTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hoyt on 2017/10/31.
 */

public class ProductServiceTestCase extends BaseTestCase {

    @Autowired
    private ProductService productService;

    @Test
    public void save() throws Exception {
        Product product = new Product();
        product.setProductName("希捷硬盘");
        product.setProductInventory(200);
        productService.save(product);
    }
}
