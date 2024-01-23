package com.DropKart.ProductService.serviceImpl;

import org.springframework.stereotype.Service;

import com.DropKart.ProductService.mapper.ProductDiscountMapper;
import com.DropKart.ProductService.service.ProductDiscountService;
import com.dropKart.commonDB.dto.ProductDiscountDto;
import com.dropKart.commonDB.model.ProductDiscount;
import com.dropKart.commonDB.repo.ProductDiscountRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductDiscountServiceImpl implements ProductDiscountService {

	
	private final ProductDiscountRepo productDiscountRepo;
	private final ProductDiscountMapper productDiscountMapper;
	@Override
	public ProductDiscountDto findDiscountOfProduct(Long id) {
		
		ProductDiscountDto productDiscountdto=new ProductDiscountDto() ;
		ProductDiscount product=new ProductDiscount();
		try {
			product=productDiscountRepo.findDiscountByProductid( String.valueOf(id));
			if(product !=null) {
				productDiscountdto=productDiscountMapper.toProductDiscountDto(product);
				return productDiscountdto;
				
			}
			else {
				productDiscountdto=new ProductDiscountDto(String.valueOf(id),0.0); 
				return productDiscountdto;
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

}
