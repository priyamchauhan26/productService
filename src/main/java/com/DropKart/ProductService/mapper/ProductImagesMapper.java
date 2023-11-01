package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;

import com.DropKart.ProductService.dto.ProductImagesDto;
import com.DropKart.ProductService.model.ProductImages;

@Mapper(componentModel="spring")
public interface ProductImagesMapper {
	ProductImagesDto toProductImagesDto(ProductImages productimages);
	ProductImages toProductImages(ProductImagesDto productImagesDto);
}
