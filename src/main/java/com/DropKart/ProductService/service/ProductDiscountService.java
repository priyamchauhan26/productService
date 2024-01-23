package com.DropKart.ProductService.service;

import com.dropKart.commonDB.dto.ProductDiscountDto;

public interface ProductDiscountService {

	ProductDiscountDto findDiscountOfProduct(Long id);

}
