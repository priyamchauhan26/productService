package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;

import com.dropKart.commonDB.dto.ProductSizeDto;
import com.dropKart.commonDB.model.ProductSize;

@Mapper(componentModel="spring")
public interface ProductSizeMapper {
	ProductSizeDto toProductSizeDto(ProductSize productSize);
	ProductSize toProductSize(ProductSizeDto productSizeDto);
}
