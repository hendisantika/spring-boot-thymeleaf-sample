package com.hendisantika.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf-sample
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/4/2021
 * Time: 8:37 AM
 * To change this template use File | Settings | File Templates.
 */
@Data
public class ProductAddRequest {

    private Integer idProduct;

    @NotNull
    @NotEmpty
    private String productName;

    @NotNull
    @NotEmpty
    private String productPrice;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date productExpire;
}
