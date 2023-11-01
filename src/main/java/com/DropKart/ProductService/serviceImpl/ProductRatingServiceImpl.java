package com.DropKart.ProductService.serviceImpl;

import org.springframework.stereotype.Service;

import com.DropKart.ProductService.dto.ProductRatingDto;
import com.DropKart.ProductService.mapper.ProductRatingMapper;
import com.DropKart.ProductService.model.ProductRating;
import com.DropKart.ProductService.repo.ProductRatingRepo;
import com.DropKart.ProductService.service.ProductRatingService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductRatingServiceImpl implements ProductRatingService {
	
	
	private final ProductRatingRepo productRatingRepo;
	private final  ProductRatingMapper productRatingMapper;
	@Override
	public ProductRatingDto findRatingOfProduct(Long id) {
		ProductRatingDto productRatingDto=new ProductRatingDto();
		ProductRating productRating=new ProductRating();
		try {
			productRating=productRatingRepo.findRatingByProductId(id);
			
			if(productRating !=null) {
				productRatingDto=productRatingMapper.toProductRatingDto(productRating);
				return productRatingDto;
			}
			else {
				productRatingDto=new ProductRatingDto(id,0.0,0);
				return productRatingDto;
			}
			
			
		}
		catch(Exception e){
			
			
		}
		return null;
	}
	

}
