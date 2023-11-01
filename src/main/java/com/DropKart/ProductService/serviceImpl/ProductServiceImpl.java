package com.DropKart.ProductService.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.DropKart.ProductService.customException.ProductNotFoundException;
import com.DropKart.ProductService.dto.ProductDiscountDto;
import com.DropKart.ProductService.dto.ProductDto;
import com.DropKart.ProductService.dto.ProductRatingDto;
import com.DropKart.ProductService.mapper.ProductMapper;
import com.DropKart.ProductService.model.Product;
import com.DropKart.ProductService.repo.ProductRepo;
import com.DropKart.ProductService.service.ProductDiscountService;
import com.DropKart.ProductService.service.ProductRatingService;
import com.DropKart.ProductService.service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepo productRepo;

	private final ProductMapper productMapper;

	private final ProductRatingService productRatingService;
	private final ProductDiscountService productDiscountService;

	@Override
	public List<ProductDto> getAllproductByCunsumerType(String consumerType) throws ProductNotFoundException {
		ProductDto productdto = new ProductDto();
		List<ProductDto> productdtolist = new ArrayList<>();
		List<Product> productlist = new ArrayList<>();
		ProductRatingDto productRatingdto = new ProductRatingDto();
		ProductDiscountDto productDiscountdto = new ProductDiscountDto();

		try {
			productlist = productRepo.findProductByConsumerType(consumerType);
			if (productlist.size() > 0) {
				for (Product product : productlist) {
					productdto = productMapper.toProductDto(product);
					if (productdto != null) {
						productRatingdto = productRatingService.findRatingOfProduct(productdto.getId());
						productdto.setProductRating(productRatingdto);
						productDiscountdto = productDiscountService.findDiscountOfProduct(product.getId());
						
					    productdto.setProductDiscount(productDiscountdto);
					} else {
						return null;
					}

					productdtolist.add(productdto);
				}
			} else {
				return null;
			}
			return productdtolist;

		} catch (Exception e) {
			throw new ProductNotFoundException("No product No Product Found !!!");
		}

	}

}
