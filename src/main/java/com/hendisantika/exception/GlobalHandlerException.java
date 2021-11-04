package com.hendisantika.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf-sample
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/4/2021
 * Time: 8:34 AM
 * To change this template use File | Settings | File Templates.
 */
@RestControllerAdvice
public class GlobalHandlerException {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalHandlerException.class);

    @ExceptionHandler(DataIsEmptyException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<?> handleDataIsEmpty(DataIsEmptyException e) {
        LOGGER.info(e.getMessage());
        return ResponseEntity.notFound().build();
    }
}
