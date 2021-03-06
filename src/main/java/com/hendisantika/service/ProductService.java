package com.hendisantika.service;

import com.hendisantika.dto.ProductAddRequest;
import com.hendisantika.entity.Product;
import com.hendisantika.exception.DataIsEmptyException;
import com.hendisantika.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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

    public List<Product> getAll() {
        List<Product> products = productRepository.findAllProduct();
        if (products.isEmpty()) {
            throw new DataIsEmptyException();
        }
        return products;
    }

    public Product findById(Integer id) {
        return productRepository.findById(id).get();
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    public void addOrUpdateProduct(ProductAddRequest productAddRequest) {
        if (productAddRequest.getIdProduct() == null) {
            Product product = new Product();
            product.setName(productAddRequest.getProductName());
            product.setPrice(new BigDecimal(productAddRequest.getProductPrice()));
            product.setExpireDate(productAddRequest.getProductExpire());
            productRepository.save(product);
        } else {
            Product currentProduct = productRepository.findById(productAddRequest.getIdProduct()).get();
            currentProduct.setName(productAddRequest.getProductName());
            currentProduct.setPrice(new BigDecimal(productAddRequest.getProductPrice()));
            currentProduct.setExpireDate(productAddRequest.getProductExpire());
            productRepository.save(currentProduct);
        }

    }
}
