package org.kshrd.example.repository;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.kshrd.example.model.Category;
import org.kshrd.example.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

/**
 * Created by Saravit on 7/3/2017.
 */
@Repository
public interface ProductRepository {
    String GET_ALL_PRODUCTS = "\n" +
            "Select p.product_id, p.product_name, c.category_id, c.category_name from tb_product p inner JOIN tb_category c on p.category_id=c.category_id";
    @Select(GET_ALL_PRODUCTS)
    @Results(value={
            @Result(property = "product_id",column = "product_id"),
            @Result(property = "product_name",column = "product_name"),
            @Result(property = "category.category_id",column = "category_id"),
            @Result(property = "category.category_name",column = "category_name")
    })
    ArrayList<Product> getAllProducts();

    @Select("Select * from tb_product where category_id=#{category_id}")
    ArrayList<Product> getProductByID(int category_id);

    /*
    Get All Categories including Products in each Category
     */
    String GET_ALL_CATEGORIES = "Select * from tb_category";
    @Select(GET_ALL_CATEGORIES)
    @Results(value={
            @Result(property = "category_id",column = "category_id"),
            @Result(property = "category_name",column = "category_name"),
            @Result(property = "products",column = "category_id",many = @Many(select = "getProductByID"))
    })
    ArrayList<Category> getAllCategoriesWithProducts();
}