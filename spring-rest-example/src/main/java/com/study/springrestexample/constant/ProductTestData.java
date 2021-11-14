/**
 * 
 */
package com.study.springrestexample.constant;

import java.util.ArrayList;
import java.util.List;

import com.study.springrestexample.dto.ProductDto;

/**
 * @author 927941
 *
 */
public class ProductTestData {

	public static List<ProductDto> getAllProductDto() {
		List<ProductDto> products = new ArrayList<>();
		var productDto = new ProductDto();
		productDto.setId("PR-SAM-11");
		productDto.setName("Samsung Galaxy Note 2");
		products.add(productDto);
		var productDto1 = new ProductDto();
		productDto1.setId("PR-IP-12");
		productDto1.setName("Iphone 4s");
		products.add(productDto1);
		var productDto2 = new ProductDto();
		productDto2.setId("PR-ON-99");
		productDto2.setName("One Plus 2");
		products.add(productDto2);
		var productDto3 = new ProductDto();
		productDto3.setId("PR-OP-13");
		productDto3.setName("Oppo Reno5");
		products.add(productDto3);
		var productDto4 = new ProductDto();
		productDto4.setId("PR-HO-10");
		productDto4.setName("Honor 9X");
		products.add(productDto4);

		return products;
	}

}
