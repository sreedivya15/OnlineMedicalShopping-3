package com.medical.repository;


	import org.springframework.stereotype.Repository;

	import com.medical.entity.Order;

	import org.springframework.data.jpa.repository.JpaRepository;

	@Repository

	public interface OrderRepository extends JpaRepository<Order, Integer>  {

	}




