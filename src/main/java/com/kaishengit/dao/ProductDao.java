package com.kaishengit.dao;

import com.kaishengit.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by hoyt on 2017/10/30.
 */

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Product product) {
        String sql = "insert into t_product (product_name,product_inventory) values(?,?)";
        jdbcTemplate.update(sql,product.getProductName(),product.getProductInventory());
    }

    public Product findById(Integer id) {
        String sql = "select * from t_product where id = ?";
        //return jdbcTemplate.queryForObject(sql, new ProductRowMapper(),id);
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Product.class),id);
    }

    public List<Product> findAll() {
        String sql = "select * from t_product";
        return jdbcTemplate.query(sql,new ProductRowMapper());
    }

    public Long count() {
        String sql = "select count(*) from t_product";
        return jdbcTemplate.queryForObject(sql,Long.class);
    }

    public void deleteById(Integer id) {
        String sql = "delete from t_product where id = ?";
        jdbcTemplate.update(sql,id);
    }
    private class ProductRowMapper implements RowMapper<Product>{
        @Override
        public Product mapRow(ResultSet resultSet, int i) throws SQLException {
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setProductName(resultSet.getString("product_name"));
            product.setProductInventory(resultSet.getInt("product_inventory"));
            return product;
        }
    }
}
