package com.DropKart.ProductService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.DropKart.ProductService.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

	

	@Query(value="SELECT * FROM sqs.product where consumer_type=:consumerType" ,nativeQuery = true)
	List<Product> findProductByConsumerType(@Param("consumerType")String consumerType);

}
