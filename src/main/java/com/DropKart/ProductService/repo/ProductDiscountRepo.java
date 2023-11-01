package com.DropKart.ProductService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.DropKart.ProductService.model.ProductDiscount;


@Repository
public interface ProductDiscountRepo extends JpaRepository<ProductDiscount, Long> {

	@Query(value="SELECT * FROM sqs.product_discount where product_id=:id",nativeQuery = true)
	ProductDiscount findDiscountByProductid(@Param("id") String id);

}
