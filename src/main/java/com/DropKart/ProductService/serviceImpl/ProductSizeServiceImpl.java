package com.DropKart.ProductService.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.DropKart.ProductService.dto.ProductSizeDto;
import com.DropKart.ProductService.mapper.ProductSizeMapper;
import com.DropKart.ProductService.model.ProductSize;
import com.DropKart.ProductService.repo.ProductSizeRepo;
import com.DropKart.ProductService.service.ProductSizeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductSizeServiceImpl implements ProductSizeService {

	private final ProductSizeRepo productSizeRepo;
	private final ProductSizeMapper productSizeMapper;

	@Override
	public List<ProductSizeDto> getProductSizeByProductId(String productId) {

		List<ProductSizeDto> productSizeDtoList = new ArrayList<>();
		List<ProductSize> productSizeList = new ArrayList<>();
		ProductSizeDto productSizeDto = new ProductSizeDto();

		try {
			productSizeList = productSizeRepo.findByProductId(productId);
			if (productSizeList.isEmpty()) {
				return null;

			} else {
				for (ProductSize productSize : productSizeList) {
					productSizeDto = new ProductSizeDto();
					productSizeDto = productSizeMapper.toProductSizeDto(productSize);

					productSizeDtoList.add(productSizeDto);

				}
				return productSizeDtoList;

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
