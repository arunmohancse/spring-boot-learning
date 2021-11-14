/**
 * 
 */
package com.study.springrestexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.study.springrestexample.constant.ProductTestData;
import com.study.springrestexample.dto.ProductDto;
import com.study.springrestexample.exception.ProductNotFoundException;
import com.study.springrestexample.util.CollectorUtils;

/**
 * @author 927941
 *
 */
@Service
public class ProductService {

    static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    /**
     * Get product details by id
     * 
     * @param id
     * @return
     * @throws ProductNotFoundException
     */
    public ProductDto getProductById(String id)
                    throws ProductNotFoundException {

        var product = findProductById(id);

        if (product == null) {
            LOGGER.info("Product not found with id - {}", id);
            throw new ProductNotFoundException("E-1001", String.format(
                            "Produt not found with id - '%s'", id), null);
        }
        return product;
    }

    /**
     * Find product from list by product id
     * 
     * @param id
     * @return
     */
    private ProductDto findProductById(String id) {
        return ProductTestData.getAllProductDto().stream()
                        .filter(p -> p.getId().equalsIgnoreCase(id))
                        .collect(CollectorUtils.toSingleton());
    }

}
