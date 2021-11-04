package com.hendisantika.service;

import com.hendisantika.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf-sample
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/4/2021
 * Time: 8:36 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

}
