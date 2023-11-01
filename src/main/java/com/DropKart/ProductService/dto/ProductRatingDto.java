package com.DropKart.ProductService.dto;

import com.DropKart.ProductService.model.ProductSize;

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
public class ProductRatingDto {

	
	private Long productRatingId;
	private Long productId;
	private double averageRating;
	private int totalReviews;
	
	public ProductRatingDto(Long id, double d, int i) {
		this.productId=id;
		this.averageRating=d;
		this.totalReviews=i;
	}

}
