package com.DropKart.ProductService.service;

import java.util.List;

import com.DropKart.ProductService.dto.ProductImagesDto;

public interface ImageService {

	List<ProductImagesDto> findImageByProductId(String productid);

}
