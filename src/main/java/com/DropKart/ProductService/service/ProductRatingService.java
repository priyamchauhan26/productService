package com.DropKart.ProductService.service;

import com.DropKart.ProductService.dto.ProductRatingDto;

public interface ProductRatingService {

	ProductRatingDto findRatingOfProduct(Long id);
	
	

}
