package com.DropKart.ProductService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.DropKart.ProductService.customException.InputDataNullException;
import com.DropKart.ProductService.customException.ProductNotFoundException;
import com.DropKart.ProductService.service.ProductService;
import com.dropKart.commonDB.dto.MessageDto;
import com.dropKart.commonDB.dto.ProductDto;
import com.dropKart.commonDB.model.Product;
import com.dropKart.commonDB.repo.ProductRepo;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
@CrossOrigin("*")
public class ProductController {
	
	private final ProductService productService;
	private final ProductRepo productRepo;
	
	@PostMapping("men")
	public ResponseEntity<MessageDto> getproductByCunsumerTypemens(@RequestParam("consumerType")String consumerType) throws ProductNotFoundException{
		MessageDto messagedto=new MessageDto();
		List<ProductDto> productdtolist=new ArrayList<>();
		try {
			if(consumerType ==null) {
				throw new InputDataNullException("Please Select the correct Consumer");
			}
			else {
				productdtolist=productService.getAllproductByCunsumerType(consumerType);
				
				if(productdtolist.size()>0) {
					messagedto.setStatus(200);
					messagedto.setHttpstatus(HttpStatus.OK);
					messagedto.setMessage("Products for Mens");
					messagedto.setData(productdtolist);
					return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);
					
				}
				else {
					throw new ProductNotFoundException("No Product Found For Mens");
				}
				
			}
			
			
		}
		catch(Exception e) {
			throw new ProductNotFoundException("No Product Found !!!");
		}
		
		
	}
	
	@PostMapping("women")
	public ResponseEntity<MessageDto> getproductByCunsumerTypewomen(@RequestParam("consumerType")String consumerType) throws ProductNotFoundException{
		MessageDto messagedto=new MessageDto();
		List<ProductDto> productdtolist=new ArrayList<>();
		try {
			if(consumerType ==null) {
				throw new InputDataNullException("Please Select the correct Consumer");
			}
			else {
				productdtolist=productService.getAllproductByCunsumerType(consumerType);
				
				if(productdtolist.size()>0) {
					messagedto.setStatus(200);
					messagedto.setHttpstatus(HttpStatus.OK);
					messagedto.setMessage("Products for Women");
					messagedto.setData(productdtolist);
					return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);
					
				}
				else {
					throw new ProductNotFoundException("No Product Found For women");
				}
				
			}
			
			
		}
		catch(Exception e) {
			throw new ProductNotFoundException("No Product Found !!!");
		}
		
		
	}
	@PostMapping("Kids")
	public ResponseEntity<MessageDto> getproductByCunsumerTypeKids(@RequestParam("consumerType")String consumerType) throws ProductNotFoundException{
		MessageDto messagedto=new MessageDto();
		List<ProductDto> productdtolist=new ArrayList<>();
		try {
			if(consumerType ==null) {
				throw new InputDataNullException("Please Select the correct Consumer");
			}
			else {
				productdtolist=productService.getAllproductByCunsumerType(consumerType);
				
				if(productdtolist.size()>0) {
					messagedto.setStatus(200);
					messagedto.setHttpstatus(HttpStatus.OK);
					messagedto.setMessage("Products for Women");
					messagedto.setData(productdtolist);
					return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);
					
				}
				else {
					throw new ProductNotFoundException("No Product Found For women");
				}
				
			}
			
			
		}
		catch(Exception e) {
			throw new ProductNotFoundException("No Product Found !!!");
		}
		
		
	}
	
	


	@PostMapping("addproduct")
	public ResponseEntity<MessageDto> addproduct(@RequestBody List<Product> product)

	{
		MessageDto messagedto=new MessageDto();
                
		try {
			for(Product p:product) {
				
			productRepo.save(p);
			}
			messagedto.setHttpstatus(HttpStatus.OK);
			messagedto.setStatus(200);
			messagedto.setMessage("Successfully Succesfully added the Product ");
			messagedto.setData(product);
			return ResponseEntity.status(messagedto.getHttpstatus()).body(messagedto);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

	
	

}


