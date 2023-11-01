package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;

import com.DropKart.ProductService.dto.ProductDto;
import com.DropKart.ProductService.model.Product;


@Mapper(componentModel="spring")
public interface ProductMapper {
	
	ProductDto toProductDto(Product product);
	Product toProduct(ProductDto productDto);

}
