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
import com.DropKart.ProductService.service.ProductSizeService;
import com.dropKart.commonDB.dto.MessageDto;
import com.dropKart.commonDB.dto.ProductSizeDto;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("productSize")
public class ProductSizeController {
	
	private final ProductSizeService productSizeService;
	
	@PostMapping("/getProductSizeByProductId")
	public ResponseEntity <MessageDto> getProductSizeByProductId(@RequestParam("productId") String productId){
		MessageDto messagedto=new MessageDto();
		List<ProductSizeDto> productsizeDtolist=new ArrayList<>();
		try {
		if(productId==null) {
			messagedto.setStatus(403);
			messagedto.setHttpstatus(HttpStatus.BAD_REQUEST);
			messagedto.setMessage("Failed");
			messagedto.setData(null);
			return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);
		}
		else {
			productsizeDtolist=productSizeService.getProductSizeByProductId(productId);
			
			if(!productsizeDtolist.isEmpty()) {
				messagedto.setStatus(200);
				messagedto.setHttpstatus(HttpStatus.OK);
				messagedto.setMessage("Images Extracted");
				messagedto.setData(productsizeDtolist);
				return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);
			}
			else {
				messagedto.setStatus(403);
				messagedto.setHttpstatus(HttpStatus.BAD_REQUEST);
				messagedto.setMessage("Product size Extracted");
				messagedto.setData(productsizeDtolist);
				return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}

}
