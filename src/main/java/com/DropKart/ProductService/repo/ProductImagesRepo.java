package com.DropKart.ProductService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.DropKart.ProductService.model.ProductImages;



@Repository
public interface ProductImagesRepo  extends JpaRepository<ProductImages, Long>  {

	@Query(value="SELECT * FROM sqs.product_images where product_id=:id",nativeQuery = true)
	List<ProductImages> findAllProductId(@Param("id")String productid);

}
