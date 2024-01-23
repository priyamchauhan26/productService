package com.DropKart.ProductService.mapper;

import org.mapstruct.Mapper;

import com.dropKart.commonDB.dto.ProductDiscountDto;
import com.dropKart.commonDB.model.ProductDiscount;


@Mapper(componentModel="spring")
public interface ProductDiscountMapper {
	ProductDiscountDto toProductDiscountDto(ProductDiscount productDiscount);
	ProductDiscount toProductDiscount(ProductDiscountDto productDiscountDto);
}
