package com.hendisantika.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf-sample
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/4/2021
 * Time: 8:27 AM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GlobalMethodSecurityConfiguration {
}
