package com.DropKart.ProductService.dto;

import com.DropKart.ProductService.model.ConsumerType;
import com.DropKart.ProductService.model.ProductSize;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
@ToString
public class ProductDto {

	private Long id;
    private String productname;
    private String price;
    private String totalquantity;
    private String sellquantity;
    private String serialnummber;
    private String address;
    private String code;
    private String mid;
    private String brandname;
	private String subcategory;
	private Long pcid;
	private String filename;
    private String createdDate;
    private String updatedDate;
	private ConsumerType consumerType;
	private ProductSizeDto productsize;
	private ProductRatingDto productRating;
	private ProductDiscountDto productDiscount;
	
	

	

}
