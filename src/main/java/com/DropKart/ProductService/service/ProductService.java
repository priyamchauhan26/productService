package com.DropKart.ProductService.service;

import java.util.List;

import com.DropKart.ProductService.customException.ProductNotFoundException;
import com.dropKart.commonDB.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getAllproductByCunsumerType(String consumerType) throws ProductNotFoundException;

}
