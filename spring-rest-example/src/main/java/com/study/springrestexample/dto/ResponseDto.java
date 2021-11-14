/**
 * 
 */
package com.study.springrestexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 927941
 *
 */
@Data
@AllArgsConstructor
public class ResponseDto {
    
    private String code;
    private String message;

}
