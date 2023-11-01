package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;
import com.DropKart.ProductService.dto.ProductSizeDto;
import com.DropKart.ProductService.model.ProductSize;

@Mapper(componentModel="spring")
public interface ProductSizeMapper {
	ProductSizeDto toProductSizeDto(ProductSize productSize);
	ProductSize toProductSize(ProductSizeDto productSizeDto);
}
