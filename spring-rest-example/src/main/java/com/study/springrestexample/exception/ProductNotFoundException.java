/**
 * 
 */
package com.study.springrestexample.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 927941
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ProductNotFoundException extends Exception {
    
    /**
     * 
     */
    private static final long serialVersionUID = 6928043397414926340L;
    
    private final String code;
    
    public ProductNotFoundException(String code, String message, Throwable e) {
        super(message, e);
        this.code = code;
    }

}
