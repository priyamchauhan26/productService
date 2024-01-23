package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;

import com.dropKart.commonDB.dto.ProductRatingDto;
import com.dropKart.commonDB.model.ProductRating;


@Mapper(componentModel="spring")
public interface ProductRatingMapper {

	ProductRatingDto toProductRatingDto(ProductRating productRating);
	ProductRating toProductRating(ProductRatingDto productDto);
}
