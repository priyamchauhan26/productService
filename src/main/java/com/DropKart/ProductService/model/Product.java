package com.DropKart.ProductService.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
@ToString
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="product_name")
	private String productname;
	@Column(name="price")
	private String price;
	@Column(name="total_quantity")
	private String totalquantity;
	@Column(name="sell_quantity")
	private String sellquantity;
	@Column(name="serial_Number")
	private  String serialnummber;
	@Column(name="prod_Adress")
	private String address;
	@Column(name="prod_code")
	private String code;
	
	@Column(name="mid")
	private String mid;
	@Column(name="brandname")
	private String brandname;
	private String subcategory;
	private Long pcid;
	private String filename;
	@Column(name="created_date")
	private String createdDate;
	@Column(name="updated_date")
	private String updatedDate;
	
	
	@Enumerated(EnumType.STRING)
	private ConsumerType consumerType;
	
	


}
