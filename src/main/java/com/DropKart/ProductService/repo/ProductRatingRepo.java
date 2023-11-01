package com.DropKart.ProductService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.DropKart.ProductService.model.ProductRating;

@Repository
public interface ProductRatingRepo extends JpaRepository<ProductRating, Long> {

	@Query(value="SELECT * FROM sqs.product_rating where product_id=:id",nativeQuery = true)
	ProductRating findRatingByProductId(@Param("id") Long valueOf);

}
