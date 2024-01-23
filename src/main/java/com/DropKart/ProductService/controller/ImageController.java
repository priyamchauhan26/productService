package com.DropKart.ProductService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.DropKart.ProductService.customException.InputDataNullException;
import com.DropKart.ProductService.service.ImageService;
import com.dropKart.commonDB.dto.MessageDto;
import com.dropKart.commonDB.dto.ProductImagesDto;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/productImages")
public class ImageController {

	private final ImageService imageService;
	
	@PostMapping("findImageByProductId")
	public ResponseEntity<MessageDto> findImageByProductId(@RequestParam("productId") String productid) throws InputDataNullException
	{
		List<ProductImagesDto>prodImagesdto=new ArrayList<>();
		MessageDto messagedto=new MessageDto();
		try {
			if(productid ==null) {
				throw new InputDataNullException("Please Select the correct Consumer");
			
			}
			else {
				prodImagesdto=imageService.findImageByProductId(productid);
				if(prodImagesdto.size()>0) {
					
					messagedto.setStatus(200);
					messagedto.setHttpstatus(HttpStatus.OK);
					messagedto.setMessage("Images Extracted");
					messagedto.setData(prodImagesdto);
					return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);
					}
				else {
					messagedto.setStatus(403);
					messagedto.setHttpstatus(HttpStatus.BAD_REQUEST);
					messagedto.setMessage("Failed");
					messagedto.setData(prodImagesdto);
					return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);
				}
			}
		}catch (Exception e) {
			
		}
		return null;
	}

}
