package com.DropKart.ProductService.service;

import com.DropKart.ProductService.dto.ProductDiscountDto;

public interface ProductDiscountService {

	ProductDiscountDto findDiscountOfProduct(Long id);

}
