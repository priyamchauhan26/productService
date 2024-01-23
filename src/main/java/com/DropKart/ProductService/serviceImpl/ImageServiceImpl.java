package com.DropKart.ProductService.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.DropKart.ProductService.mapper.ProductImagesMapper;
import com.DropKart.ProductService.service.ImageService;
import com.dropKart.commonDB.dto.ProductImagesDto;
import com.dropKart.commonDB.model.ProductImages;
import com.dropKart.commonDB.repo.ProductImagesRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {
	
	private final ProductImagesMapper productImagesmapper;
	private final ProductImagesRepo productImagesrepo;

	@Override
	public List<ProductImagesDto> findImageByProductId(String productid) {
		
		List<ProductImages> productImageslist=new ArrayList<>();
		List<ProductImagesDto> productImagesDtoList=new ArrayList<>();
		ProductImagesDto productlistdto=new ProductImagesDto();
		try {
			productImageslist=productImagesrepo.findAllProductId(productid);
			if(productImageslist.size()>0) {
				for(ProductImages images:productImageslist) {
					productlistdto=new ProductImagesDto();
					productlistdto=productImagesmapper.toProductImagesDto(images);
					productImagesDtoList.add(productlistdto);
				}
				return productImagesDtoList;
			}
			else {
				return null;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}

}
