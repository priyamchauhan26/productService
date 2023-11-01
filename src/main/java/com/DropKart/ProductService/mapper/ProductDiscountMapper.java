package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;

import com.DropKart.ProductService.dto.ProductDiscountDto;
import com.DropKart.ProductService.model.ProductDiscount;



@Mapper(componentModel="spring")
public interface ProductDiscountMapper {
	ProductDiscountDto toProductDiscountDto(ProductDiscount productDiscount);
	ProductDiscount toProductDiscount(ProductDiscountDto productDiscountDto);
}
