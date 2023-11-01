package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;

import com.DropKart.ProductService.dto.ProductRatingDto;
import com.DropKart.ProductService.model.ProductRating;

@Mapper(componentModel="spring")
public interface ProductRatingMapper {

	ProductRatingDto toProductRatingDto(ProductRating productRating);
	ProductRating toProductRating(ProductRatingDto productDto);
}
