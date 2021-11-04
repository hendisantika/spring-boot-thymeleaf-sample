package com.hendisantika.service;

import com.hendisantika.entity.User;
import com.hendisantika.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf-sample
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/4/2021
 * Time: 8:42 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserService {
    private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();
    @Autowired
    private UserRepository userRepository;

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if (user != null) {
            detailsChecker.check(user);
        }
        return user;
    }
}
