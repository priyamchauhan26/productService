package com.DropKart.ProductService.service;

import java.util.List;

import com.dropKart.commonDB.dto.ProductSizeDto;


public interface ProductSizeService {

	List<ProductSizeDto> getProductSizeByProductId(String productId);

}
