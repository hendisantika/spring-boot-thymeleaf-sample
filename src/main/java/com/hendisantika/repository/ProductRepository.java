package com.hendisantika.repository;

import com.hendisantika.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf-sample
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/4/2021
 * Time: 8:35 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("select p from Product p")
    List<Product> findAllProduct();
}
