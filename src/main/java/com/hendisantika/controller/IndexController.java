package com.hendisantika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf-sample
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/4/2021
 * Time: 8:43 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    private String redirectIndex() {
        return "redirect:products/page";
    }
}
