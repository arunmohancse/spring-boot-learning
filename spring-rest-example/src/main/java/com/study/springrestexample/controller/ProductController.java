/**
 * 
 */
package com.study.springrestexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springrestexample.exception.ProductNotFoundException;
import com.study.springrestexample.service.ProductService;

/**
 * @author 927941
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    
    @Autowired
    ProductService productService;

    /**
     * API for fetching product details
     * 
     * @param productId
     * @return
     * @throws ProductNotFoundException
     */
    @GetMapping(value = "/get/{productId}")
    public ResponseEntity<Object> getProductById(
                    @PathVariable(value = "productId") String productId)
                    throws ProductNotFoundException {

        var productDto = this.productService.getProductById(productId);

        return ResponseEntity.ok(productDto);

    }

}
