package com.DropKart.ProductService.service;

import java.util.List;

import com.DropKart.ProductService.dto.ProductSizeDto;

public interface ProductSizeService {

	List<ProductSizeDto> getProductSizeByProductId(String productId);

}
