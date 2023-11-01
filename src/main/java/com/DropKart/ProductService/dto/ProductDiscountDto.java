package com.DropKart.ProductService.dto;

import java.time.LocalDate;

import com.DropKart.ProductService.model.ProductRating;

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
public class ProductDiscountDto {
	
	private Long discountId;
	    private String productId;
	    private double discountPercentage;
	    private LocalDate startDate;
	    private LocalDate endDate;
	    
	    public ProductDiscountDto(String productId, double d) {
			this.productId=productId;
			this.discountPercentage=d;
		}

}
