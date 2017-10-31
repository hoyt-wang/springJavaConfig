package com.kaishengit.service;

import com.kaishengit.dao.ProductDao;
import com.kaishengit.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hoyt on 2017/10/31.
 */

@Repository
//@Transactional(isolation = Isolation.DEFAULT)
public class ProductService {

    @Autowired
    private ProductDao productDao;

   @Transactional//(rollbackFor = Exception.class)可以回滚事务
    public void save(Product product) {
        productDao.save(product);
        if (true) {
            throw new RuntimeException();//发生运行时异常时会自动回滚事务
        }
        productDao.save(product);
    }
}
