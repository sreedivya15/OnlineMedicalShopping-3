package com.medical.repository;


	import java.util.List;

	import org.springframework.data.jpa.repository.Query;
	import org.springframework.data.repository.query.Param;
	import org.springframework.stereotype.Repository;

	import com.medical.entity.Order;

	@Repository

	public interface IOrderCustomRepository {
		
		public Order  getOrderByUserName(String userName) throws Exception;
		public Order getOrderByMedicineName(String medicineName) throws Exception;
		public Order getOrderByOrderId(Integer orderId) throws Exception;
	}


