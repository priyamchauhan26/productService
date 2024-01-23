package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;

import com.dropKart.commonDB.dto.ProductImagesDto;

import com.dropKart.commonDB.model.ProductImages;

@Mapper(componentModel="spring")
public interface ProductImagesMapper {
	ProductImagesDto toProductImagesDto(ProductImages productimages);
	ProductImages toProductImages(ProductImagesDto productImagesDto);
}
