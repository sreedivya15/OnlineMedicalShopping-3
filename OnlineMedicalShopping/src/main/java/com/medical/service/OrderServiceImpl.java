package com.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.entity.Order;
import com.medical.repository.OrderRepository;

@Service

public class OrderServiceImpl  implements OrderService {
	@Autowired
	OrderRepository orderRepository;

	@Override
	public Order insertOrder(Order order) throws Exception {
		Order savedOrder = orderRepository.save(order);
		return savedOrder;
	}

	@Override
	public List<Order> getAllOrders() throws Exception {
		List<Order> allOrders = orderRepository.findAll();
		return allOrders;
	}

	@Override
	public Order updateOrderById(int orderId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deleteOrderById(int orderId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int orderId) throws Exception {
		orderRepository.deleteById(orderId);
		
		
	}
	

}
