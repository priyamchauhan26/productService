package com.DropKart.ProductService.service;

import com.dropKart.commonDB.dto.ProductRatingDto;

public interface ProductRatingService {

	ProductRatingDto findRatingOfProduct(Long id);
	
	

}
