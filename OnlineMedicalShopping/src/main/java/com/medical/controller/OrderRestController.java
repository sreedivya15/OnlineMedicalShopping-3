package com.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.entity.Order;
import com.medical.service.OrderService;

import com.medical.entity.Order;
import com.medical.service.OrderService;

@RestController
@RequestMapping("/orderstore")
@CrossOrigin
public class OrderRestController {

	@Autowired
	OrderService orderService;

	public OrderRestController() {
		System.out.println("\n\n\n=======>> Inside Contructor " + this);
	}

	@GetMapping("/welcome")
	public String welcome() {

		return "Welcome to Order Store";

	}

	@PostMapping("/addorder") // http://localhost:8020/orderstore/addorder
	public ResponseEntity<String> addOrder(@RequestBody Order order) {
		try {
			Order savedOrder = orderService.insertOrder(order);
			String responseMsg = savedOrder.getUserName() + "MedicineName" + savedOrder.getMedicineName();
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg = "Contact customer care Ph.no:- 1800-250-900 or mail to:- medicalstore@gmail.com";
			return new ResponseEntity<String>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/orders") // http://localhost:8020/orderstore/orders
	public List<Order> getAllOrders() {
		try {
			List<Order> allExtractedOrders = orderService.getAllOrders();
			return allExtractedOrders;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@DeleteMapping("/orderid/{searchOrderId}") // http://localhost:8020/orderstore/orderid/1
	public void deleteUser(@PathVariable int searchOrderId) {
		try {
			orderService.delete(searchOrderId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
