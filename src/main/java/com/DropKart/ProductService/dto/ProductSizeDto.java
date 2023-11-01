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
public class ProductSizeDto {
	private Long sizeid;
	private String productSize;
	private String productId;
}
