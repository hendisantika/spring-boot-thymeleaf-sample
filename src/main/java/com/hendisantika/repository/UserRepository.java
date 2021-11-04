package com.hendisantika.repository;

import com.hendisantika.entity.User;
import org.springframework.data.repository.CrudRepository;

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
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
