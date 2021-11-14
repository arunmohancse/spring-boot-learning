/**
 * 
 */
package com.study.springrestexample.advisor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.study.springrestexample.dto.ResponseDto;
import com.study.springrestexample.exception.ProductNotFoundException;

/**
 * @author 927941
 *
 */
@ControllerAdvice
public class ProductControllerAdvisor {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<Object> productNotFoundHandler(
                    ProductNotFoundException productNotFoundException) {
        var responseDto = new ResponseDto(productNotFoundException.getCode(),
                        productNotFoundException.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.NOT_FOUND);
    }
}
